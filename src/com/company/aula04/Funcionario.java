package com.company.aula04;

public class Funcionario extends Pessoa{
    private String cargo;
    protected float salario;
    private int id;
    private static int contador = 0;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String rg, String cargo, float salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
        contador ++;
        this.id = contador;
    }

    protected Funcionario(String nome, String cpf, String rg, float salario) {
        super(nome, cpf, rg);
        this.salario = salario;
        contador ++;
        this.id = contador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }
}
