package com.company.aula04;

import java.util.List;

public class Aluno extends Pessoa{
    private int idade;
    private String turma;
    Disciplina[] notas;
    private List<Double> notasPorDisciplina;
    private int id;
    private static int contador = 0;

    private double nota1oBimestre;
    private double nota2oBimestre;
    private double nota3oBimestre;
    private double nota4oBimestre;
    private double media;

    private double notaGenerica;

    public Aluno() {
        contador ++;
        this.id = contador;
    }

    public Aluno(String nome, String cpf, String rg, int idade, String turma) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        contador ++;
        this.id = contador;
    }

    public Aluno(String nome, String cpf, String rg, int idade, String turma, List<Double> notasPorDisciplina) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.notasPorDisciplina = notasPorDisciplina;
        contador ++;
        this.id = contador;
    }

    public Aluno(String nome, String cpf, String rg, int idade, String turma, double nota1oBimestre, double nota2oBimestre, double nota3oBimestre, double nota4oBimestre) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.nota1oBimestre = nota1oBimestre;
        this.nota2oBimestre = nota2oBimestre;
        this.nota3oBimestre = nota3oBimestre;
        this.nota4oBimestre = nota4oBimestre;
        this.media = obterMedia(nota1oBimestre, nota2oBimestre, nota3oBimestre, nota4oBimestre);
        this.notasPorDisciplina = definirNotasPorDisciplina(nota1oBimestre, nota2oBimestre, nota3oBimestre, nota4oBimestre);
        contador ++;
        this.id = contador;
    }

    public List<Double> definirNotasPorDisciplina(double nota1oBimestre, double nota2oBimestre, double nota3oBimestre, double nota4oBimestre) {
        this.notasPorDisciplina.add(nota1oBimestre);
        this.notasPorDisciplina.add(nota2oBimestre);
        this.notasPorDisciplina.add(nota3oBimestre);
        this.notasPorDisciplina.add(nota4oBimestre);
        return notasPorDisciplina;
    }

    public double obterMedia(double nota1oBimestre, double nota2oBimestre, double nota3oBimestre, double nota4oBimestre){
        media = (nota1oBimestre + nota2oBimestre + nota3oBimestre + nota4oBimestre)/4;
        return media;
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


    public double getNota1oBimestre() {
        return nota1oBimestre;
    }

    public void setNota1oBimestre(double nota1oBimestre) {
        this.nota1oBimestre = nota1oBimestre;
    }

    public double getNota2oBimestre() {
        return nota2oBimestre;
    }

    public void setNota2oBimestre(double nota2oBimestre) {
        this.nota2oBimestre = nota2oBimestre;
    }

    public double getNota3oBimestre() {
        return nota3oBimestre;
    }

    public void setNota3oBimestre(double nota3oBimestre) {
        this.nota3oBimestre = nota3oBimestre;
    }

    public double getNota4oBimestre() {
        return nota4oBimestre;
    }

    public void setNota4oBimestre(double nota4oBimestre) {
        this.nota4oBimestre = nota4oBimestre;
    }

    public double getMedia() {
        return media;
    }

    public double getNotaGenerica() {
        return notaGenerica;
    }

    public void setNotaGenerica(double notaGenerica) {
        this.notaGenerica = notaGenerica;
    }

    public int getId() {
        return id;
    }
}
