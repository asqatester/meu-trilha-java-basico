package _00_exemplosPilaresPOO;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		//jeep.confereCambio(); //foram encapsulados usando private na classe de origem
		//jeep.confereCombustivel(); //foram encapsulados usando private na classe de origem
		jeep.setChassi("89796");
		//jeep.ligar();//polimorfismo, pois carro e moto tem modos diferentes de ligar
		
		
		
		Moto z400 = new Moto();
		z400.setChassi("8540394");
		//z400.ligar();
		
		//abaixo consigo comprovar o polimorfismo, mostra como moto e carro ligam diferentes
		Veiculo coringa1 = z400;
		coringa1.ligar();
		
		Veiculo coringa2 = jeep;
		coringa2.ligar();
		
				
	}

}
