package _04_exemploPolimorfismo1;

import apps1.*;

public class UserPedroPolimorfo {
	public static void main(String[] args) {		
		
		SvcMnsgInstantPolimorfo smi = null;

		String appEscolhido="fbm"; 

		if(appEscolhido.equals("msn"))
			smi = new MSNMessengerPolimorfo();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessengerPolimorfo();
		else if(appEscolhido.equals("tlg"))
			smi = new TelegramPolimorfo();
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
	}
}