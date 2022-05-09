package com.company.aula03;

import java.util.List;
import java.util.Scanner;

public class Estoque {
    public String nome;
    private List<Produto> produtos;
    private int id;
    private static int contador = 1;

    public Estoque(String nome, List<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
        this.id = contador++;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public int getId() {
        return id;
    }

    public void listarTodosOsProdutos() {
        for (Produto produto : produtos) {
            listarDadosDoProduto(produto);
        }
    }

    public void inserirNovoProduto() {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.print("Insira o nome do produto: ");
        produto.setNome(scanner.nextLine());

        System.out.print("Insira a marca do produto: ");
        produto.setMarca(scanner.nextLine());

        System.out.print("Insira a quantidade do produto em estoque: ");
        produto.setQuantidadeEmEstoque(Integer.parseInt(scanner.nextLine()));

        if (!verificarSeProdutoJaExiste(produto)) {
            System.out.print("Insira a sessão do produto: ");
            produto.setSessao(scanner.nextLine());

            System.out.print("Insira o tipo do produto: ");
            produto.setTipo(scanner.nextLine());
            this.produtos.add(produto);
        } else{
            System.out.println("Produto já existente.");
            System.out.println("Quantidade em estoque atualizada.");
        }

        scanner.close();
    }

    private boolean verificarSeProdutoJaExiste(Produto produto) {

        for (Produto produto1 : produtos)
            if (produto.getNome().equals(produto1.getNome())) {
                if (produto.getMarca().equals(produto1.getMarca())) {
                    produto1.setQuantidadeEmEstoque(produto1.getQuantidadeEmEstoque() + produto.getQuantidadeEmEstoque());
                    return true;
                }
            }
        return false;
    }

    public void deletarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove((produto.getId() - 1));
                break;
            }
        }
    }

    public void atualizarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Insira o nome do produto: ");
                produto.setNome(scanner.nextLine());

                System.out.print("Insira a marca do produto: ");
                produto.setMarca(scanner.nextLine());

                System.out.print("Insira a quantidade do produto em estoque: ");
                produto.setQuantidadeEmEstoque(Integer.parseInt(scanner.nextLine()));

                System.out.print("Insira a sessão do produto: ");
                produto.setSessao(scanner.nextLine());

                System.out.print("Insira o tipo do produto: ");
                produto.setTipo(scanner.nextLine());

                scanner.close();
            }
        }
    }

    public void exibirDadosDoProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                listarDadosDoProduto(produto);
            }
        }
    }

    private void listarDadosDoProduto(Produto produto){
        System.out.println("---------------*****---------------");
        System.out.println("Identificador: " + produto.getId());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Sessão: " + produto.getSessao());
        System.out.println("Tipo: " + produto.getTipo());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
        System.out.println("Marca: " + produto.getMarca());
    }

}
