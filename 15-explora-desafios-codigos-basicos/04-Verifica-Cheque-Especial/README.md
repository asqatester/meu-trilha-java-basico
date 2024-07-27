Descrição
Você está desenvolvendo um programa simples em Java para verificar se uma conta bancária ultrapassou o limite do cheque especial. A aplicação solicitará ao cliente que informe o saldo atual da conta bancária. Em seguida, o programa pedirá o valor de um saque que o cliente deseja realizar.

O limite do cheque especial será definido como 500 unidades monetárias.

Entrada
O programa solicitará ao usuário que informe o saldo atual da conta bancária.
Em seguida, o programa solicitará o valor de um saque que o cliente deseja realizar.
Saída
O programa deverá verificar se o saque ultrapassará o saldo disponível na conta.
Se o saque não ultrapassar o saldo, o programa informará que a transação foi realizada com sucesso.
Se o saque ultrapassar o saldo, o programa verificará se o valor do saque ultrapassa o cheque especial (definido como 500 unidades monetárias).
Se ultrapassar, o programa informará que a transação não pode ser realizada devido ao limite excedido.
Caso contrário, o programa informará que a transação foi realizada com sucesso, utilizando o cheque especial.
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

Entrada	Saída
1000
100	Transação realizada com sucesso.
2500 
2750	Transação realizada com sucesso utilizando o cheque especial.
300
1500	Transação não realizada. Limite do cheque especial excedido.

----------------------------------------