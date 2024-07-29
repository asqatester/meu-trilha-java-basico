package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0d;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Produto p : estoqueProdutosMap.values()) {
        valorTotalEstoque += p.getQuantidade() * p.getPreco();
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    for (Produto p : estoqueProdutosMap.values()) {
      if (p.getPreco() > maiorPreco) {
        produtoMaisCaro = p;
        maiorPreco = p.getPreco();
      }
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    for (Produto p : estoqueProdutosMap.values()) {
      if (p.getPreco() < menorPreco) {
        produtoMaisBarato = p;
        menorPreco = p.getPreco();
      }
    }
    return produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorQuantidadeValorNoEstoque = null;
    double maiorValorTotalProdutoEstoque = 0d;
    if (!estoqueProdutosMap.isEmpty()) {
      for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
        }
      }
    }
    return produtoMaiorQuantidadeValorNoEstoque;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoque = new EstoqueProdutos();

    // Exibe o estoque vazio
    estoque.exibirProdutos();

    // Adiciona produtos ao estoque
    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    estoque.adicionarProduto(5L, "Impressora", 7, 300.0);
    estoque.adicionarProduto(6L, "Cadeira Ergonômica", 3, 600.0);
    estoque.adicionarProduto(7L, "Mesa de Escritório", 4, 450.0);
    estoque.adicionarProduto(8L, "Webcam", 8, 80.0);
    estoque.adicionarProduto(9L, "Microfone", 6, 120.0);
    estoque.adicionarProduto(10L, "Fone de Ouvido", 12, 90.0);
    estoque.adicionarProduto(11L, "Pen Drive 64GB", 15, 35.0);
    estoque.adicionarProduto(12L, "HD Externo 1TB", 9, 250.0);
    estoque.adicionarProduto(13L, "Roteador", 5, 150.0);
    estoque.adicionarProduto(14L, "Projetor", 2, 700.0);


    // Exibe os produtos no estoque
    estoque.exibirProdutos();

    // Calcula e exibe o valor total do estoque
    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

    // Obtém e exibe o produto mais caro
    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
    System.out.println("Produto mais caro: " + produtoMaisCaro);

    // Obtém e exibe o produto mais barato
    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
    System.out.println("Produto mais barato: " + produtoMaisBarato);

    // Obtém e exibe o produto com a maior quantidade em valor no estoque
    Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
  }
}
