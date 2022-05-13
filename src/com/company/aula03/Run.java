package com.company.aula03;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
       //Testes
        Produto produto1 = new Produto("nome", "sessao", "tipo", 10, "marca");
        System.out.println(produto1.getId());
        Produto produto2 = new Produto("nome2", "sessao2", "tipo2", 15, "marca");
        System.out.println(produto1.getId());
        System.out.println(produto2.getId());
        List<Produto> produtos = new ArrayList<>();
        Estoque estoque = new Estoque("nome", produtos);
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        System.out.println(estoque.getId());
        //produtos.add(produto1);

        //produtos.add(produto2);
        //estoque.inserirNovoProduto();
        estoque.listarTodosOsProdutos();
        estoque.deletarProdutoPorId(produto1.getId());

        //estoque.atualizarProduto(1);
        estoque.listarTodosOsProdutos();
        estoque.exibirDadosDoProduto(produto1);
        estoque.exibirDadosDoProduto(produto2);
        estoque.inserirNovoProduto();
        estoque.listarTodosOsProdutos();
    }
}
