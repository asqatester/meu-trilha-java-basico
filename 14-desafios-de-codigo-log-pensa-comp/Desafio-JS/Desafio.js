//Desafios Javascript na DIO tem funções "gets" e "print" acessíveis globalmente;
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

//Lê os valores de Entrada:
const valorSalario = parseFloat(gets());
const valorBeneficios = parseFloat(gets());

//Calcula o imposto através da função "calcularImposto":
const valorImposto = calcularImposto(valorSalario);
//Calcula e imprime a Saída (com duas casas decimais):
const saida = valorSalario - valorImposto + valorBeneficios;
print(saida.toFixed(2));

//Função útil para o cálculo do imposto (baseado nas alíquotas).
function calcularImposto(salario) {
  let aliquota;
  if (salario >= 0 && salario <= 1100) {
    aliquota = 0.05;
  }
  //TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%.
  else if (Salario >= 1100.01 && Salario <= 2500.0) {
    // Atribui a aliquota de 10% sobre o salário:
    aliquota = 0.1;
  } else {
    // Atribui a aliquota de 15% sobre o salário:
    aliquota = 0.15;
  }
  return aliquota * salario;
}
