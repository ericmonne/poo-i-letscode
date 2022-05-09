package com.company.aula03;

public class Produto {

    private String nome;
    private String sessao;
    private String tipo;
    private int quantidadeEmEstoque;
    private String marca;
    private int id ;
    private static int contador = 1;

    public Produto() {
        this.id = contador++;
    }

    public Produto(String nome, String sessao, String tipo, int quantidadeEmEstoque, String marca) {
        this.nome = nome;
        this.sessao = sessao;
        this.tipo = tipo;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.marca = marca;
        this.id = contador++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
