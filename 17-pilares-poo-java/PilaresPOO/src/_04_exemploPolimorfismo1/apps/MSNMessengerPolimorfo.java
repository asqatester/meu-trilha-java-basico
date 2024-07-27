package apps1;

public class MSNMessengerPolimorfo extends SvcMnsgInstantPolimorfo {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("MSN exemplo de POLIMORFISMO");
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}