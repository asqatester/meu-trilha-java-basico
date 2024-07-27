// ExemploFor.java
public class ExemploForArray {
    public static void main(String[] args) {
		//em arrays o índice incia em zero
	    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
             //inicialização //condição  //incremento
	    for (int x=0; x<alunos.length; x++) {
		    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
	    }
    }
}