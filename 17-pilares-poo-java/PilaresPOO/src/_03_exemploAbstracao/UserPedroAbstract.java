package _03_exemploAbstracao;

public class UserPedroAbstract {
	public static void main(String[] args) {
		System.out.println("MSN exemplo de ABSTRAÇÃO");
		MSNMessengerAbstract msn = new MSNMessengerAbstract();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		System.out.println("FACEBOOK exemplo de ABSTRAÇÃO");
		FacebookMessengerAbstract fbm = new FacebookMessengerAbstract();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
		System.out.println("TELEGRAM exemplo de ABSTRAÇÃO");
		TelegramAbstract tlg = new TelegramAbstract();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}