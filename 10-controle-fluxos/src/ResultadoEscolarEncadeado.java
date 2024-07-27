// ResultadoEscolar.java
public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {
        double nota = 4.9;

	if (nota >= 7)//deve retornar true
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)//deve retornar true ou false
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}