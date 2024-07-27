public class SistemaMedidaCondicional {
    public static void main(String[] args) {
		String sigla = "M";

		if("P".equals(sigla))
			System.out.println("PEQUENO");
		else if("M".equals(sigla))

			System.out.println("MÉDIO");
		else if(sigla == "G")//deve se usar equals para comparar strings

			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
			
		
	}
}