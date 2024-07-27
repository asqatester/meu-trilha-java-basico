package enums;

//enums são utilizados para valores pré-estabelecidos
//Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
// o termo enum não é um tipo de variável
public enum EstadoBrasileiro {
	//constante de objeto denominada SAO_PAULO
	SAO_PAULO ("SP","São Paulo",11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro",12),
	PIAUI ("PI", "Piauí",13),
	MARANHAO ("MA","Maranhão",14),
	CEARA("CE","Ceará",15)
	;
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getIbge() {
		return ibge;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
}