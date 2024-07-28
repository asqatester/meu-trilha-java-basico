package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
  //atributo
  private List<Pessoa> pessoaList;

  public OrdenacaoPessoas() {
    this.pessoaList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoaList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorIdade);
      return pessoasPorIdade;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    if (!pessoaList.isEmpty()) {
      Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
  // Criando uma instância da classe OrdenacaoPessoas
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    // Adicionando pessoas à lista
    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("Yara", 30, 1.71);
    ordenacaoPessoas.adicionarPessoa("Zane", 22, 1.84);
    ordenacaoPessoas.adicionarPessoa("Alex", 27, 1.69);
    ordenacaoPessoas.adicionarPessoa("Brian", 35, 1.87);
    ordenacaoPessoas.adicionarPessoa("Cindy", 24, 1.57);
    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("John", 40, 1.85);
    ordenacaoPessoas.adicionarPessoa("Kate", 27, 1.60);
    ordenacaoPessoas.adicionarPessoa("Liam", 21, 1.75);
    ordenacaoPessoas.adicionarPessoa("Maya", 32, 1.68);
    ordenacaoPessoas.adicionarPessoa("Noah", 18, 1.80);
    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

    // Exibindo a lista de pessoas adicionadas
    System.out.println(ordenacaoPessoas.pessoaList);

    // Ordenando e exibindo por idade
    //System.out.println(ordenacaoPessoas.ordenarPorIdade());

    // ORDENANDO E EXIBINDO POR IDADE
    try {
        List<Pessoa> pessoasOrdenadas = ordenacaoPessoas.ordenarPorIdade();
        System.out.println("************** ORDENAÇÃO DAS PESSOAS POR IDADE *******");
        // Imprime cada pessoa em uma nova linha
        for (Pessoa pessoa : pessoasOrdenadas) {
            System.out.println(pessoa);
        }
    } catch (RuntimeException e) {
        System.out.println(e.getMessage());
    }
    
    
    
    // Ordenando e exibindo por altura
    //System.out.println(ordenacaoPessoas.ordenarPorAltura());
    
    // Supondo que você já tem uma lista de pessoas e um método de ordenação
    //ordenacaoPessoas = new OrdenacaoPessoas();
    
    // ORDENANDO E EXIBINDO POR ALTURA
    try {
        List<Pessoa> pessoasOrdenadas = ordenacaoPessoas.ordenarPorAltura();
        System.out.println("************** ORDENAÇÃO DAS PESSOAS POR ALTURA *******");
        // Imprime cada pessoa em uma nova linha
        for (Pessoa pessoa : pessoasOrdenadas) {
            System.out.println(pessoa);
        }
    } catch (RuntimeException e) {
        System.out.println(e.getMessage());
    }
    
    
    
    
    
    
    
  }
}
