// ExemploFor.java
// laço for são repetições contadas

/*Vamos imaginar que Joãozinho precisa contar até 20 carneirinhos, para pegar no sono:*/
public class ExemploFor {
	public static void main(String[] args) {
            //bloco declaração     //bloco contagem   //bloco incremento
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println("Contando carneirinhos: " + carneirinhos + " - Carneirinho(s)");
		}
        System.out.println("Joãozinho dormiu.");
	}
}


/*
 * Qual é o resultado da saída do código abaixo ?

public static void main(String[] args) {
        int numero = 1;

        for (int x=1; x<2; x++){
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);
    }
 * 
 * 
 */