package com.company.aula02;

import java.time.LocalDate;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    LocalDate dataCadastro;

    Pessoa(){
        dataCadastro = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataCadastro=" + dataCadastro +
                '}';
    }

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        dataCadastro = LocalDate.now();
    }

    void falar(){
        System.out.println(this.nome + " " + this.sobrenome + " está falando.");
    }
}
