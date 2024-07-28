package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  //atributo
  private Set<Produto> produtoSet;

  public CadastroProdutos() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produtoSet.add(new Produto(cod, nome, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    if (!produtoSet.isEmpty()) {
      return produtosPorNome;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    if (!produtoSet.isEmpty()) {
      produtosPorPreco.addAll(produtoSet);
      return produtosPorPreco;
    } else {
      throw new RuntimeException("O conjunto está vazio!");
    }
  }

  public static void main(String[] args) {
    // Criando uma instância do CadastroProdutos
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    // Adicionando produtos ao cadastro
    cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
    cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
    cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
    cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
    cadastroProdutos.adicionarProduto(5L, "Tablet", 800d, 8);
    cadastroProdutos.adicionarProduto(6L, "Smartwatch", 500d, 12);
    cadastroProdutos.adicionarProduto(7L, "Fones de ouvido", 150d, 30);
    cadastroProdutos.adicionarProduto(8L, "Impressora", 300d, 5);
    cadastroProdutos.adicionarProduto(9L, "Monitor", 400d, 10);
    cadastroProdutos.adicionarProduto(10L, "Caixa de som", 200d, 15);
    cadastroProdutos.adicionarProduto(11L, "Câmera digital", 700d, 7);
    cadastroProdutos.adicionarProduto(12L, "Projetor", 1200d, 3);
    cadastroProdutos.adicionarProduto(13L, "Pen drive", 20d, 50);
    cadastroProdutos.adicionarProduto(14L, "HD externo", 100d, 25);


    // Exibindo todos os produtos no cadastro
    System.out.println(cadastroProdutos.produtoSet);

    // Exibindo produtos ordenados por nome
    System.out.println(cadastroProdutos.exibirProdutosPorNome());

    // Exibindo produtos ordenados por preço
    System.out.println(cadastroProdutos.exibirProdutosPorPreco());
  }
}
