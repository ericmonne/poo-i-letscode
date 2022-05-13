package com.company.aula04;

import java.util.List;

public class Professor extends Funcionario{
    private List<String> turmas;
    private List<Disciplina> disciplinas;
    private int id;
    private static int contador = 0;

    public Professor() {
        contador ++;
        this.id = contador;
    }

    public Professor(String nome, String cpf, String rg, float salario, List<String> turmas, List<Disciplina> disciplinas) {
        super(nome, cpf, rg, salario);
        this.turmas = turmas;
        this.disciplinas = disciplinas;
        contador ++;
        this.id = contador;
    }

    public List<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<String> turmas) {
        this.turmas = turmas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public int getId() {
        return id;
    }
}
