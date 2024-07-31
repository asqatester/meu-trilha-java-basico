package Default;
					     //uso de herança
public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== EXTRATO CONTA CORRENTE ===");
		super.imprimirDadosComuns();
	}
	
	
}