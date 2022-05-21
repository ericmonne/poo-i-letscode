package com.company.aula06;

public class Dano {
    protected int valor;
    protected String tipo;

    public Dano(int valor) {
        this.valor = valor;
    }

    public Dano(int valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}


