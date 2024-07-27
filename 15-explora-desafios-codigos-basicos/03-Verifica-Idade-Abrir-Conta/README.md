Descrição
Você está desenvolvendo um programa simples em Java para verificar se um cliente é elegível para criar uma conta bancária. A condição é que o cliente deve ter pelo menos 18 anos de idade.

Entrada
O programa solicitará ao usuário que digite sua idade.
Saída
Utilizando apenas um bloco if e else, o programa verificará se a idade do cliente é igual ou superior a 18 anos.
Se a idade for maior ou igual a 18, o programa informará que o cliente é elegível para criar uma conta bancária.
Se a idade for menor que 18, o programa informará que o cliente não é elegível para criar uma conta bancária.
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
17	Voce nao esta elegivel para criar uma conta bancaria.
26	Voce esta elegivel para criar uma conta bancaria.
18	Voce esta elegivel para criar uma conta bancaria.

---------------

Todas as entradas e saída dos algoritmos são utilizados o STDIN e STDOUT de cada linguagem, abaixo tem algumas dicas de como utilizar cada STDIN e STDOUT de cada linguagem.
JavaScript

Em JavaScript as funções de STDIN e STDOUT respectivamente são gets e console.log, a função gets é implementada internamente para auxiliar a entrada dos dados.

Exemplo:
let line = gets(); // Lê a linha de entrada
console.log(line); // Imprime o dado

Java

Em Java existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar BufferedReader para o STDIN e o System.out.println para o STDOUT.

Exemplo:
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringTokenizer st = new StringTokenizer(br.readLine()); // Lê a linha de entrada
int a = Integer.parseInt(st.nextToken());
System.out.println(a); // Imprime o dado

Python

Em Python existe várias formas de implementar o STDIN e STDOUT recomendamos utilizar sys.stdin.readline para o STDIN e o print para o STDOUT.

Exemplo:
import sys
a = int(sys.stdin.readline()) // Lê a linha de entrada
print(a); // Imprime o dado

