package apps1;

// Em Java, o conceito de abstração é representado pela palavra reservada **abstract**e métodos 
// que NÃO possuem corpo na classe abstrata (pai).

public abstract class SvcMnsgInstantPolimorfo {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}
