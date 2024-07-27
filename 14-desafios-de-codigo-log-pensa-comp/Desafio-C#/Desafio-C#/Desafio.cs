using System;

public class Desafio
{
    public static void Main()
    {
        // Lê os valores de entrada:{
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100)
        {
            // Atribui a aliquota de 5% sobre o salário:
            valorImposto = 0.05F * valorSalario;
        }
        // Criar as demais condições para as alíquotas de 10.00% e 15.00%.
        else if (valorSalario >= 1100.01 && valorSalario <= 2500.00)
        {
            // Atribui a aliquota de 10% sobre o salário:
            valorImposto = 0.10F * valorSalario;
        }
        else
        {
            // Atribui a aliquota de 15% sobre o salário:
            valorImposto = 0.15F * valorSalario;
        }
        // Calcula e imprime a saída (com duas casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        Console.WriteLine(saida.ToString("0.00"));
    }
}