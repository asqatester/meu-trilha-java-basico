package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
  //atributo
  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
      return livrosPorAutor;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloAnos.add(l);
        }
      }
      return livrosPorIntervaloAnos;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
      for (Livro l : livroList) {
        if (l.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = l;
          break;
        }
      }
      return livroPorTitulo;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância do catálogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2010);
    catalogoLivros.adicionarLivro("O Programador Pragmático", "Andy Hunt e Dave Thomas", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
    catalogoLivros.adicionarLivro("Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", 1994);
    catalogoLivros.adicionarLivro("Código Limpo: A arte da programação", "Robert C. Martin", 2009); // Tradução brasileira
    catalogoLivros.adicionarLivro("The Mythical Man-Month", "Frederick P. Brooks Jr.", 1975);
    catalogoLivros.adicionarLivro("Refactoring: Improving the Design of Existing Code", "Martin Fowler", 1999);
    catalogoLivros.adicionarLivro("Clean Architecture: A Craftsman's Guide to Software Structure", "Robert C. Martin", 2017);
    catalogoLivros.adicionarLivro("O Design de Software na Prática", "Eric Freeman", 2014);
    catalogoLivros.adicionarLivro("Refatoração", "Martin Fowler", 2019);
    catalogoLivros.adicionarLivro("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 2008);
    catalogoLivros.adicionarLivro("Introdução ao Algoritmo", "Thomas H. Cormen et al.", 2009);
    catalogoLivros.adicionarLivro("JavaScript: O Guia Definitivo", "David Flanagan", 2020);

    // Exibindo livros pelo mesmo autor
    System.out.println("******** PESQUISA POR MESMO AUTOR:");
    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

    // Exibindo livros pelo mesmo autor (caso em que não há livros de um autor específico)
    System.out.println("******** PESQUISA POR UM AUTOR INXISTENTE (retorna vazio):");
    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

    // Exibindo livros dentro de um intervalo de anos
    System.out.println("******** PESQUISA POR INTERVALO DE ANOS ENTRE 2010 E 2022: ");
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
    System.out.println("******** PESQUISA POR INTERVALO DE ANOS ENTRE 2025 E 2030 (retorna vazio): ");
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

    // Exibindo livros por título
    System.out.println("******** PESQUISA POR TÍTULO:");
    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

    // Exibindo livros por título (caso em que não há livros com o título especificado)
    System.out.println("******** PESQUISA POR UM TÍTULO INEXISTENTE (retorna null pois é o valor inicial do objeto Livro :");
    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
  }
}
