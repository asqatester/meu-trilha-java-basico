package Default;

//a interface nada mais é do que uma classe abstrata com todos os métodos abstratos
//veja que a interface nem permite que os métodos tenham corpo, as chaves " { } "
//outra coisa é que seus métodos são naturalmente e sempre públicos, logo dispensa
//declarar o modificador public

public interface IConta {
	
	//a ação sacar precisa ser informado um valor
	void sacar(double valor);
	
	//a ação depositar precisa ser informado um valor
	void depositar(double valor); 
	
	//a ação transferir precisar ser informado uma conta de destino
	void transferir(double valor, Conta contaDestino); 
	
	void imprimirExtrato();

}
