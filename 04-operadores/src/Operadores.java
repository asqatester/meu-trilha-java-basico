import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
       
        System.out.println("Hello, World!");
        
        //classe Operadores.java
        String nome = "GLEYSON";
        System.out.println("Um tipo String: " + nome);
        int idade = 22;
        System.out.println("Um tipo int: " + idade);
        double peso = 68.5;
        System.out.println("Um tipo double: " + peso);
        char sexo = 'M';
        System.out.println("Um tipo char: " + sexo);
        boolean doadorOrgao = false;
        System.out.println("Um tipo boolean: " + doadorOrgao);
        Date dataNascimento = new Date();
        System.out.println("Um tipo Date: " + dataNascimento);

        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println("Concatenanado duas strings: " + nomeCompleto);
                
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 
        System.out.println("Concatenação agora é: " + concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println("Concatenação agora é: " + concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println("Concatenação agora é: " + concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println("Concatenação agora é: " + concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println("Concatenação agora é: " + concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println("Concatenação agora é: " + concatenacao);


        /*
        Unários
        Esses operadores, são aplicados juntamente com um outro operador aritmético. 
        Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter 
        valores numéricos e booleanos.
        */
        //classe Operadores.java
        int numero = 5;
        System.out.println("Imprimindo o numero: " + numero);        
        //Imprimindo o numero negativo
        System.out.println("Agora imprimindo o numero como negativo: " + -numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);// ops algo de errado não está certo
        //no parâmetro acima primeiro exibedepois que incrementa, virando 7

        //aí sim abaixo exibirá ele já incrementado
        System.out.println(numero);// agora sim, numero virado em 7

        //ordem de precedencia conta aqui
        System.out.println(++ numero);//agora sim primeiro incrementa depois exibe 8

        boolean verdadeiro = true;

        //exemplo de negação de boolean
        System.out.println("Inverteu " + !verdadeiro);


        /**
        *Ternário
        *O operador de condição ternária é uma forma resumida para definir uma condição e escolher 
        *por um dentre dois valores. Você deve pensar numa condição ternária, como se fosse uma 
        *condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.
        *O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
        *<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
        */
            // classe Operadores.java
            int a, b;

            a = 5;
            b = 6;

            /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
            if(a==b)
            resultado = "verdadeiro";
            else
            resultado = "falso";
            */

            //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            String resultado = (a==b) ? "verdadeiro" : "false";

            System.out.println(resultado);
    }
}
