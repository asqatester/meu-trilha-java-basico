public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=15;

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada=false;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void subirCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal);
    }

    public void descerCanal(){
        canal--;
        System.out.println("Diminuindo o canal para: " + canal);
    }
}
