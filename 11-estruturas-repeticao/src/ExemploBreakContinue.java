// class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
        System.out.println("INSTRUÇÃO 'BREAK'");
	for(int numero = 1; numero <=5; numero ++){
		if(numero == 3)
			break; //interrompe o laço e não imprime 3
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ? 1 e 2

    System.out.println("ABAIXO INSTRUÇÃO 'CONTINUE'");
    for(int numero = 1; numero <=5; numero ++){
		if(numero == 3)
			continue; //não executa a próxima instrução, apenas prossegue no laço
		
		System.out.println(numero);//ou seja, se executou o 'continue', 3 não imprime e segue o laço
		
	}
	    //Qual a saída no console ? 1 e 2

    }
}