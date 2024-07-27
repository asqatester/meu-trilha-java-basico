
// ExemploWhile.java
// repetições com teste no inicio

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int count = 0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
            count++;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em " + count + " doces");

        /*
         * Não se preocupe quanto a formatação de valores
         * Iremos explorar os recursos de formatação em breve !!
         */
    }

    private static double valorAleatorio() {
                                                    //parâmetros de range
        return ThreadLocalRandom.current().nextDouble(2, 18);
    }
}

/*
 * Qual é o resultado da saída do código abaixo ?

 public static void main(String[] args) {
        boolean condicao = false;

        while(condicao){
            System.out.println("executou ... ");
        }
    }

 * 
 * 
 */