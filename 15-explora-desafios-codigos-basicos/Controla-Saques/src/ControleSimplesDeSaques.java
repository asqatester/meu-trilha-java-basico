import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double limiteRestante = 0.0;
            double limiteDiario = scanner.nextDouble();
            // Loop for para iterar sobre os saques
            for (int i = 1;; i++) {
                double valorSaque = scanner.nextDouble();
                
                if (valorSaque == 0) {
                    System.out.println("Transacoes encerradas.");
                    break; // Encerra o loop
                } else if (valorSaque > limiteDiario) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    break; // Encerra o loop
                } else {
                    limiteRestante = limiteDiario - valorSaque;
                    System.out.println("Saque realizado. Limite restante: " + limiteRestante + "\nTransacoes encerradas.");
                    break;
                    // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                }
            }
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
}