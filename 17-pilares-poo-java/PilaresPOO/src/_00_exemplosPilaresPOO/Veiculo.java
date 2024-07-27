package _00_exemplosPilaresPOO;

public abstract class Veiculo {//classe generica para fornecer herança
	private String chassi;
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	//deixo como herança o método ligar, mas como não sei o jeito de ligar cada
	//um dos herdeiros, esse método é abstrato
	public abstract void ligar();
}
