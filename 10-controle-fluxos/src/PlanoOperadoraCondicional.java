public class PlanoOperadoraCondicional {
    public static void main(String[] args) {
		String plano = "M"; //M / T
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if("M".equals(plano)) {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
	}
}