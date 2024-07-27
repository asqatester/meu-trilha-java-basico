package _02_exemploHeranca;

//a classe MSNMessenger é ou representa
public class SvcMnsgInstantHerda {
	public void enviarMensagem() {
		//primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		//depois de enviada, salva o histórico da mensagem
		salvarHistoricoMensagem();
	}
	public void receberMensagem(String rx) {
		//System.out.println("Recebendo mensagem");
		//System.out.println(rx);
		
//o switch case abaixo deve ser substituido usando abstraçãoe polimorfismo (veja pacote)
		switch (rx) {
		case "msn":{
			System.out.println("Recebendo mensagem pelo MSN.");
			break;
		}
		case "fbm":{
			System.out.println("Recebendo mensagem pelo Facebook.");
			break;
		}
		case "tlg":{
			System.out.println("Recebendo mensagem pelo Telegram.");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
	}
	
	//métodos privadas, visíveis somente na classe
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
