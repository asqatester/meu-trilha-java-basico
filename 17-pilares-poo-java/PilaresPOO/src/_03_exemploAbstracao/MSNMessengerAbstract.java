package _03_exemploAbstracao;

public class MSNMessengerAbstract extends SvcMnsgInstantAbstract{
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}
