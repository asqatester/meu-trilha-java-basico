package functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream 
 * sem modificar, ou retornar um valor.
 */
public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o Consumer com expressão lambda para imprimir números pares
    //"numero" representa cada elemento de dentro do streamer
    // IMPLEMENTANDO UM CONSUMER...
    Consumer<Integer> imprimirNumeroPar = numero -> {
      if (numero % 2 == 0) {
        System.out.println(numero);
      }
    };
    
    //AGORA, PARA FAZER A MESMA OPERAÇÃO DE MANEIRA FUNCIONAL UTILIZAMOS OS STREAMS!

    //EXEMPLO 1:
    //ABAIXO CONVERTEMOS O LIST numeros NUM STREAM E SEU MÉTODO forEach É QUEM IMPRIME 
    //O QUE VIER DO CONSUMER imprimirNumeroPar
    numeros.stream().forEach(imprimirNumeroPar);
    
    
    // Usar o Consumer para imprimir números pares no Stream
    numeros.stream()//aqui está transformando a lista num stream
        .filter(n -> n % 2 == 0)//ESSE FILTER A COMPREENSÃO É SÓ NA AULA DE PREDICATE
        .forEach(System.out::println);
    
 
    
  }
}
