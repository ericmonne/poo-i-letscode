package com.company.aula04;

public class Run {
    public static void main(String[] args) {
        SistemaEscola escola = new SistemaEscola();
//        List<Professor> professores = new ArrayList<>();
//        escola.setListaProfessores(professores);
//        List<Aluno> alunos = new ArrayList<>();
//        escola.setListaAlunos(alunos);
//        List<Funcionario> funcionarios = new ArrayList<>();
//        escola.setListaFuncionarios(funcionarios);
        escola.mostrarMenu();



        //TESTES

//        List<Aluno> alunos = new ArrayList<>();
//        escola.setListaAlunos(alunos);
        //escola.adicionarAluno();
//        Funcionario funcionario = new Funcionario("Alfa", "424.565.788-89", "77.911.155-0", "inspetor de classe", 6500.00f);
//        Funcionario funcionario2 = new Funcionario("Beta", "124.165.188-19", "27.211.255-2", "faxineiro", 4500.00f);
//        List<Funcionario> funcionarios = new ArrayList<>();
//        funcionarios.add(funcionario);
//        funcionarios.add(funcionario2);
//
//        List<Professor> professores = new ArrayList<>();
//        escola.setListaFuncionarios(funcionarios);
//        escola.exibirFuncionario(funcionario);

        escola.listarAlunosSemNota();
        escola.listarProfessores();
        escola.listarFuncionarios();
    }
}
