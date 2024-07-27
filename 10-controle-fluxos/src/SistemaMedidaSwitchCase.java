// Modo condicional switch / case
// avalie a abordagem quando cabe usar switch case
public class SistemaMedidaSwitchCase {
    public static void main(String[] args) {
        String sigla1 = "M";

        switch (sigla1) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }

        String sigla2 = "G";
        // Convert switch to rule switch, veja que some o break
        // pesquisar para saber do que se trata
        switch (sigla2) {
            case "P" -> {
                System.out.println("PEQUENO");
            }
            case "M" -> {
                System.out.println("MÉDIO");
            }
            case "G" -> {
                System.out.println("GRANDE");
            }
            default -> System.out.println("INDEFINIDO");
        }

    }

}