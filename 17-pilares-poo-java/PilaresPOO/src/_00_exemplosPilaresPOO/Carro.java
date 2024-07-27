package _00_exemplosPilaresPOO;

public class Carro extends Veiculo {//extendes aplica herança

	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");

	}
	// o private encapsula (esconde ações executadas dentro apenas da própria classe)
	//por isso as chamadas desses dois métods a seguir estão feitas no método acima "lgar"
	
	private  void confereCombustivel () {
		System.out.println("conferindo combustível");
			
	}
	
	private  void confereCambio () {
		System.out.println("conferindo câmbio em P");
			
	}
	

}
