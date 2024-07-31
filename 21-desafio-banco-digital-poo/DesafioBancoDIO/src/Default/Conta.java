package Default;

//esta classe é abstrata. isso garante que ela não pode ser instanciada (uso do new), apenas
//herdada por classes filha

//uso de interface via implements, obriga esta classe sobrecarregar aqui os métodos abstratos 
//da interface via chamada @override

public abstract class Conta implements IConta{
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	//modificador que encapsula mas permite a classe filha acessar
	protected int agencia;//
	protected int numero;
	protected double saldo;
	protected Cliente cliente;//exemplo para conceito de Composição, uma conta é de um cliente especifico
	
	//não é 'final' pq será sempre incrementada
	//é static para que tenha relação com a classe  dela e não com a instancia da classe
	public Conta(Cliente cliente){//exemplo de Composição, pois cliente compõe a conta		
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
		
	@Override
	public void sacar(double valor) {
		//saldo = saldo - valor; OU
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		//saldo = saldo + valor; OU
				saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);//saca dessa (this) conta e...
		contaDestino.depositar(valor);//...deposita na contaDestino
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirDadosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));//%d para formatar como decimal
		System.out.println(String.format("Agencia: %d", this.agencia));//%d para formatar como decimal
		System.out.println(String.format("Numero: %d",  numero));//o 'this' nesse caso é opcional
		System.out.println(String.format("Saldo: %.2f", saldo));//.2f põe duas casas decimais
	}
}
