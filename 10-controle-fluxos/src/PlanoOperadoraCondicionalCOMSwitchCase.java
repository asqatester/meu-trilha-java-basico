/*Fomos requisitados a criar um sistema de plano telefônico onde:
O sistema terá 03 planos: BASIC, MIDIA , TURBO;
	BASIC: 100 minutos de ligação;
	MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
	TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
*/

public class PlanoOperadoraCondicionalCOMSwitchCase {
	public static void main(String[] args) {
		String plano1 = "M"; //M / T
		if(plano1 == "B") {
			System.out.println("100 minutos de ligação");
		}else if("M".equals(plano1)) {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano1 == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}

		System.out.println("RETORNO DO SWITCH CASE: ");
		System.out.println("VEJA QUE BASTA NÃO COLOCAR OBREAK PARA QUE A ROTINA CONTINUE E");
		System.out.println("EXIBA OS DEMAIS ITENS QUE COMPÕEM O PLANO ESCOLHIDO.");

		String plano2 = "T";
		switch (plano2) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}

	}
}