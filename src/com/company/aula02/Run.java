package com.company.aula02;

public class Run {
    public static void main(String[] args) {
        Pessoa fulano = new Pessoa();
        fulano.nome = "Victor";
        fulano.sobrenome = "Valdés";
        System.out.println(fulano.dataCadastro);
        fulano.falar();
    }
}
