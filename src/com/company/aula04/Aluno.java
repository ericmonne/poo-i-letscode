package com.company.aula04;

import java.util.List;

public class Aluno extends Pessoa{
    private int idade;
    private String turma;
    private List<Double> notasPorDisciplina;

    public Aluno() {

    }

    public Aluno(String nome, String cpf, String rg, int idade, String turma, List<Double> notasPorDisciplina) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.notasPorDisciplina = notasPorDisciplina;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Double> getNotasPorDisciplina() {
        return notasPorDisciplina;
    }

    public void setNotasPorDisciplina(List<Double> notasPorDisciplina) {
        this.notasPorDisciplina = notasPorDisciplina;
    }
}
