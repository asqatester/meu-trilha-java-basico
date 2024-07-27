import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 0.0;
            boolean continuar = true;

            while (continuar) {
               // System.out.println("Saldo disponível: R$ " + saldo);
  /*            System.out.println("""
                Escolha o número da operação:\r
                1 - Depositar\r
                2 - Sacar\r
                3 - Consultar Saldo\r
                0 - Encerrar""" //
        );

        */

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> {
                        // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                        //System.out.println("Informe o valor para depósito:");
                        double vlrDeposito = scanner.nextDouble();
                        saldo = saldo + vlrDeposito;
                        //System.out.println("Valor depositado: R$ " + vlrDeposito);
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    }
                    case 2 -> {
                        // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                        //System.out.println("Informe o valor para saque:");
                        double vlrSaque = scanner.nextDouble();
                        if (saldo >= vlrSaque) {
                            //System.out.println("Saldo atual: " + saldo);
                            saldo = saldo - vlrSaque;
                            System.out.println("Saldo atual: " + saldo);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                        break;
                    }
                    case 3 -> // TODO: Exibir o saldo atual da conta.
                        System.out.println("Saldo atual: " + saldo);
                    case 0 -> {
                        System.out.println("Programa encerrado.");
                        continuar = false; // Atualiza a variável de controle para encerrar o loop
                        break;
                    }
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            }
            scanner.close();
        }
    }
}