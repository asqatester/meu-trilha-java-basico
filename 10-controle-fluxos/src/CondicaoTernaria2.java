// Cenário 2
public class CondicaoTernaria2 {
    public static void main(String[] args) {
        int nota = 2;
                         //if...                 //else if ...                           //else...
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
