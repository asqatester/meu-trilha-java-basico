package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  //atributo
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
  }

  public void exibirContatos() {
    if (!agendaContatoMap.isEmpty()) {
      System.out.println(agendaContatoMap);
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
      if (numeroPorNome == null) {
        System.out.println("Contato não encontrado na agenda.");
      }
    } else {
      System.out.println("A agenda de contatos está vazia.");
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    // Adicionar contatos
    agendaContatos.adicionarContato("João", 123456789);
    agendaContatos.adicionarContato("Maria", 987654321);
    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
    agendaContatos.adicionarContato("Ana", 88889999);
    agendaContatos.adicionarContato("Fernando", 77778888);
    agendaContatos.adicionarContato("Carolina", 55555555);
    agendaContatos.adicionarContato("Pedro", 654321098);
    agendaContatos.adicionarContato("Ana Clara", 987654321); // Mesmo sobrenome que "Ana"
    agendaContatos.adicionarContato("Carlos Eduardo", 123456789);
    agendaContatos.adicionarContato("Juliana", 55555555); // Mesmo número que "Maria Fernandes" e "Carolina"
    agendaContatos.adicionarContato("Rafael", 88889999); // Mesmo número que "Ana"
    agendaContatos.adicionarContato("Fernanda", 77778888); // Mesmo número que "Fernando"
    agendaContatos.adicionarContato("Bruna", 44443333);
    agendaContatos.adicionarContato("Gustavo", 22221111);
    agendaContatos.adicionarContato("Luiza", 987654321); // Mesmo número que "Maria" e "Ana Clara"
    agendaContatos.adicionarContato("Paulo", 11112222);


    agendaContatos.exibirContatos();

    // Remover um contato
    agendaContatos.removerContato("Maria");
    agendaContatos.exibirContatos();

    // Pesquisar número por nome
    String nomePesquisa = "João";
    Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

    String nomePesquisaNaoExistente = "Paula";
    Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
  }
}