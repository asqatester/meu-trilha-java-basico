public class MinhaClasse {
    public static void main (String [] args){
        System.out.print("Ola turma, sejam bem vindos!");
        //variáveis de um modo geral são camelCase. Mas se tiverem que ser imutáveis
        //como é o caso do 'pi', estados brasileiro, nome de país ou ano específico
        //deverão ser declaradas como 'final' e UperCase. Exemplos:
        //String BR = "Brasil";
        //double PI = 3.14;
        //int ESTADOS_BRASILEIRO = 27;
        //int ANO_2000 = 2000;

        //String meuNome = "André";
        //int anoFabricacao = 2022;
        //boolean verdadeira = false;

        String primeiroNome = "Andre";
        String segundoNome = "Santos";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
