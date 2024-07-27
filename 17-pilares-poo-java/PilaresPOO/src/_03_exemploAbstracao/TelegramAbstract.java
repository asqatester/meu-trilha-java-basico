package _03_exemploAbstracao;

public class TelegramAbstract extends SvcMnsgInstantAbstract {
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}

