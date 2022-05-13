package com.company.aula04;


public class Disciplina {
    private String nome;
    private double nota;

    public Disciplina() {
    }

    public Disciplina(String nome) {
        this.nome = nome;
    }
    public Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
