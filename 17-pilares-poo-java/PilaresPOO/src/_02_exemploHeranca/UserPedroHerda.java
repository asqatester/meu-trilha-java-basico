package _02_exemploHeranca;

public class UserPedroHerda {
	public static void main(String[] args) {
		System.out.println("MSN exemplo de HERANÇA");
		MSNMessengerHerda msn = new MSNMessengerHerda();
		msn.enviarMensagem();
		msn.receberMensagem("msn");
		
		System.out.println("FACEBOOK exemplo de HERANÇA");
		FacebookMessengerHerda fbm = new FacebookMessengerHerda();
		fbm.enviarMensagem();
		fbm.receberMensagem("fbm");
		
		System.out.println("TELEGRAM exemplo de HERANÇA");
		TelegramHerda tlg = new TelegramHerda();
		tlg.enviarMensagem();
		tlg.receberMensagem("tlg");
		
	}
}