package br.com.dio.debbuging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

        int mediaInt = calculaMediaDaTurmaInt(alunos, scan);
        double mediaDouble = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %d", mediaInt);        
        System.out.printf("Média da turma %.2f", mediaDouble);//%.2f chama duas casas decimais
    }
    public static int calculaMediaDaTurmaInt(String[] alunos, Scanner scanner) {

        int somaInt = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            somaInt += nota;
        }

        return somaInt / alunos.length;
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double somaDouble = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            somaDouble += nota;
        }

        return somaDouble / alunos.length;
    }
}
