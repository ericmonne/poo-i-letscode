package com.company.aula04;

import java.util.List;
import java.util.Scanner;

public class Escola {
    private List<Aluno> listaAlunos;
    private List<Professor> listaProfessores;
    private List<Funcionario> listaFuncionarios;

    public void adicionarAluno(){
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        adicionarPessoa();

//        System.out.print("Informe o nome: ");
//        aluno.setNome(scanner.nextLine());
//
//        System.out.print("Informe o CPF: ");
//        aluno.setCpf(scanner.nextLine());
//
//        System.out.print("Informe o RG: ");
//        aluno.setRg(scanner.nextLine());

        System.out.print("Informe a idade do aluno: ");
        aluno.setIdade(Integer.parseInt(scanner.nextLine()));

        System.out.print("Informe a turma do aluno: ");
        aluno.setTurma(scanner.nextLine());

        this.listaAlunos.add(aluno);
        scanner.close();
    }

    public void adicionarFuncionario(){
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        adicionarPessoa();
        scanner.close();
    }

    private void adicionarPessoa(){
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("Informe o CPF: ");
        pessoa.setCpf(scanner.nextLine());

        System.out.print("Informe o RG: ");
        pessoa.setRg(scanner.nextLine());

    }

    public void listarPessoa(Pessoa pessoa){

    }
    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
}
