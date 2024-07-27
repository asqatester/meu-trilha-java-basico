package apps1;

public class TelegramPolimorfo extends SvcMnsgInstantPolimorfo {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("TELEGRAM exemplo de POLIMORFISMO");
		System.out.println("Enviando mensagem pelo Telegram");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}