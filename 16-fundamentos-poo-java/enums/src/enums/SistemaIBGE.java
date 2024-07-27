package enums;

public class SistemaIBGE {
	public static void main(String[] args) {
		//.values é o método que retorna um array de elementos definidos em uma 
		//classe tipo Enum
		for(EstadoBrasileiro e:EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome());
		}
		EstadoBrasileiro eb = EstadoBrasileiro.CEARA;
		
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getIbge());
		
	}
}