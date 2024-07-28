package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  //atributo
  private Set<Contato> contatosSet;

  public AgendaContatos() {
    this.contatosSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatosSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    if (!contatosSet.isEmpty()) {
      System.out.println(contatosSet);
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().startsWith(nome)) {
          contatosPorNome.add(c);
        }
      }
      return contatosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    if (!contatosSet.isEmpty()) {
      for (Contato c : contatosSet) {
        if (c.getNome().equalsIgnoreCase(nome)) {
          c.setNumero(novoNumero);
          contatoAtualizado = c;
          break;
        }
      }
      return contatoAtualizado;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância da classe AgendaContatos
    AgendaContatos agendaContatos = new AgendaContatos();

    // Exibindo os contatos no conjunto (deve estar vazio)
    agendaContatos.exibirContatos();

    // Adicionando contatos à agenda
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


    // Exibindo os contatos na agenda
    agendaContatos.exibirContatos();

    // Pesquisando contatos pelo nome
    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

    // Atualizando o número de um contato
    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
    System.out.println("Contato atualizado: " + contatoAtualizado);

    // Exibindo os contatos atualizados na agenda
    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContatos();
  }
}
