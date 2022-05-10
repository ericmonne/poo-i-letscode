package com.company.aula04;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Escola escola = new Escola();
        List<Aluno> alunos = new ArrayList<>();
        escola.setListaAlunos(alunos);
        escola.adicionarAluno();

    }
}
