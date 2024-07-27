package construtores;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
	// o nome deverá ser igual ao nome da classe
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	// não abuse no uso de construtores. não é boa prática passar todos os aributos
	// no construtor, apenas os mais relevantes. mas pode ter dois ou mais consrutores
	//inclusive sem parametros. exemplos a seguir:
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}

