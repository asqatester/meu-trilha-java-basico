package Default;

import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas;//exemplo para conceito de Composição, pois banco é composto por contas
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
