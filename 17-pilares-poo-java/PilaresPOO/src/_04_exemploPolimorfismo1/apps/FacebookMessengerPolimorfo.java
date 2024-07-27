package apps1;

public class FacebookMessengerPolimorfo extends SvcMnsgInstantPolimorfo {
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("FACEBOOK exemplo de POLIMORFISMO");
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}