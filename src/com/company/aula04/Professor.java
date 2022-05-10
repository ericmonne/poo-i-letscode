package com.company.aula04;

import java.util.List;

public class Professor extends Funcionario{
    private List<String> turmas;
    private List<String> disciplinas;

    public Professor() {
    }

    public Professor(String nome, String cpf, String rg, float salario, List<String> turmas, List<String> disciplinas) {
        super(nome, cpf, rg, salario);
        this.turmas = turmas;
        this.disciplinas = disciplinas;
    }

    public List<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<String> turmas) {
        this.turmas = turmas;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
