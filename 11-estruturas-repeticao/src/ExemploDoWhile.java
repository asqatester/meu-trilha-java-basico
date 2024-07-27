// ExemploDoWhile.java
// repetições com teste no final
import java.util.Random;
public class ExemploDoWhile {
	public static void main(String[] args) {
		System.out.println("Discando...");
		//faça...
		do {
			//excutando repetidas vezes até alguém atender
			System.out.println("Telefone tocando");
		  //enquanto...
		} while(tocando());
		
		System.out.println("Alô !!!");
	}
	private static boolean tocando() {       //range de 1 a 3
		boolean atendeu = new Random().nextInt(3) == 1;//se o randon identico, retorna true
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}


/*
 * 
 * int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
        } while (count <= 3);

Dado o código acima, o que será impresso no console?
 * 
 * 
 */