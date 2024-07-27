package _03_exemploAbstracao;

public class FacebookMessengerAbstract extends SvcMnsgInstantAbstract {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}