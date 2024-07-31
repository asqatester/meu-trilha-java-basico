package Default;

public class OperacoesBancarias {

	public static void main(String[] args) {
		Cliente santosCC = new Cliente();
		santosCC.setNome("Santos");
		
		Cliente andradeCP = new Cliente();
		andradeCP.setNome("Andrade");
		
		
		
		Conta cc = new ContaCorrente(santosCC);
		cc.depositar(150);
		
		Conta cp = new ContaPoupanca(andradeCP);
		cp.depositar(300);
		cp.transferir(35.00, cc);
				
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
