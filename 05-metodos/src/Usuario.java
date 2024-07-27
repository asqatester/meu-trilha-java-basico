
public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();//14
        smartTv.diminuirVolume();//13
        smartTv.diminuirVolume();//12
        smartTv.aumentarVolume();//13

        System.out.println("Canal antes: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);


        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status: TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status: TV ligada? " + smartTv.ligada);

    }
}
