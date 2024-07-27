package _01_exemploEncapsulamento;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class UserPedroEncapsula {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessengerEncapsula msn = new MSNMessengerEncapsula();
		
		msn.enviarMensagem();
		
		msn.receberMensagem();
	}
}