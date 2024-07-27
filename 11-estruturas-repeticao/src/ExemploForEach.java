
import java.util.Arrays;

// ExemploFor.java
public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Forma abreviada
        //determino que será realizado um for (laço) que possui elementos do tipo String e que a cada
        //iteração d alunos (:), o aluno atual, do índice atual vai atualizar automaticamente
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
            System.out.println(Arrays.toString(alunos));
        }
    }
}
