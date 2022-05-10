package com.company.aula04;

public class Funcionario extends Pessoa{
    protected String cargo;
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String rg, String cargo, float salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(String nome, String cpf, String rg, float salario) {
        super(nome, cpf, rg);
        this.salario = salario;
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
}
