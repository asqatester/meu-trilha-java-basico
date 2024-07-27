package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe José");
		felipe.setIdade(12);
		felipe.setSexo("M");
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade()
		+ " anos e é do sexo " + felipe.getSexo() );	
	}
}