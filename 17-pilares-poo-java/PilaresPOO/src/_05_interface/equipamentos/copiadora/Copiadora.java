package _05_interface.equipamentos.copiadora;

//a interface é comom se fosse uma classe abstrata, 
//apenas estabelece um contrato, uma espécie de template, mas não sabe somo serão feitas as coisas
public interface Copiadora {
	//então ao invés de definir métodos conforme abaixo:
	
	//public  void copiar() {
		//System.out.println("Copiando...");
	//}
	
	//substitui a palavra class por interface e declara apenas o que se quer, exemplo:
	public void copiar();

}
