package com.company.aula03;

import java.util.List;
import java.util.Scanner;

public class Estoque {
    public String nome;
    private List<Produto> produtos;
    private int id;
    private static int contadorId = 0;

    private void inicializarId() {
        contadorId++;
        this.id = contadorId;
    }

    public Estoque(String nome, List<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
        inicializarId();
    }

    public Estoque() {
        inicializarId();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public int getId() {
        return id;
    }

    public void listarTodosOsProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (Produto produto : produtos) {
                listarDadosDoProduto(produto);
            }
        }
    }

    public void adicionarNovoProduto(Produto novoProduto) {
        if (!verificarSeProdutoJaExisteEAlterarQuantidade(novoProduto)) {
            produtos.add(novoProduto);
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

        if (!verificarSeProdutoJaExisteEAlterarQuantidade(produto)) {
            System.out.print("Insira a sessão do produto: ");
            produto.setSessao(scanner.nextLine());

            System.out.print("Insira o tipo do produto: ");
            produto.setTipo(scanner.nextLine());
            this.produtos.add(produto);
        } else {
            System.out.println("Produto já existente.");
            System.out.println("Quantidade em estoque atualizada.");
        }

        scanner.close();
    }

    private boolean verificarSeProdutoJaExisteEAlterarQuantidade(Produto novoProduto) {
        for (Produto produto : produtos)
            if (produto.getNome().equalsIgnoreCase(novoProduto.getNome())) {
                if (produto.getMarca().equalsIgnoreCase(novoProduto.getMarca())) {
                    novoProduto.setQuantidadeEmEstoque(novoProduto.getQuantidadeEmEstoque() + produto.getQuantidadeEmEstoque());
                    return true;
                }
            }
        return false;
    }

    public void deletarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove((produto.getId() - 1));
                System.out.println("--------*****--------");
                System.out.println("Item deletado com sucesso");
                break;
            }
        }
    }

    public void deletarProdutoPorReferencia(Produto produto){
        if(verificarSimplesSeProdutoExiste(produto)){
            produtos.remove(produto.getId());
            System.out.println("Item deletado com sucesso");
        } else {
            System.out.println("Não foi possível deletar: produto não existe em estoque");
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

    public void exibirDadosDoProduto(Produto produto) {
        if (verificarSimplesSeProdutoExiste(produto)) {
            listarDadosDoProduto(produto);
        } else {
            System.out.println("-------*****-------");
            System.out.println(produto.getNome() + " não existe no estoque.");
        }

    }


    private boolean verificarSimplesSeProdutoExiste(Produto produto) {

        if (produtos.contains(produto)) {
            return true;
        }
        return false;
    }


    private void listarDadosDoProduto(Produto produto) {
        System.out.println("---------------*****---------------");
        System.out.println("Identificador: " + produto.getId());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Sessão: " + produto.getSessao());
        System.out.println("Tipo: " + produto.getTipo());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());
        System.out.println("Marca: " + produto.getMarca());
    }

}
