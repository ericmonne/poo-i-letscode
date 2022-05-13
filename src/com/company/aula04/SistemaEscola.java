package com.company.aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaEscola {
    private List<Pessoa> listaPessoas;
    private List<Aluno> listaAlunos;
    private List<Professor> listaProfessores;
    private List<Funcionario> listaFuncionarios;
    private List<Disciplina> listaTodasDisciplinas;
    private List<Disciplina> listaDisciplinasPorProfessor;

    public void adicionarAluno() {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        adicionarPessoa(aluno);

        System.out.print("Informe a idade: ");
        aluno.setIdade(Integer.parseInt(scanner.nextLine()));

        System.out.print("Informe a turma: ");
        aluno.setTurma(scanner.nextLine());

        this.listaAlunos.add(aluno);
    }

    public void adicionarFuncionario() {
        Funcionario funcionario = new Funcionario();
        Scanner scanner = new Scanner(System.in);
        adicionarPessoa(funcionario);

        System.out.print("Informe o cargo: ");
        funcionario.setCargo(scanner.nextLine());

        System.out.print("Informe o salário: R$");
        funcionario.setSalario(Float.parseFloat(scanner.nextLine()));

        this.listaFuncionarios.add(funcionario);
    }

    public void adicionarProfessor() {
        Professor professor = new Professor();
        Scanner scanner = new Scanner(System.in);
        adicionarPessoa(professor);

        System.out.print("Informe o salário: R$");
        professor.setSalario(Float.parseFloat(scanner.nextLine()));

        professor.setCargo("professor");
        this.listaProfessores.add(professor);
        this.listaFuncionarios.add(professor);

    }

    private void adicionarPessoa(Pessoa pessoa) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        pessoa.setNome(scanner.nextLine());

        System.out.print("Informe o CPF: ");
        pessoa.setCpf(scanner.nextLine());

        System.out.print("Informe o RG: ");
        pessoa.setRg(scanner.nextLine());
        this.listaPessoas.add(pessoa);
    }

    public void modificarProfessor(int id) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        for (Professor professor : listaProfessores) {
            if (professor.getId() == id) {
                System.out.print("Informe o novo nome: ");
                professor.setNome(scanner.nextLine());

                System.out.print("Informe o novo CPF: ");
                professor.setCpf(scanner.nextLine());

                System.out.print("Informe o novo RG: ");
                professor.setRg(scanner.nextLine());

                System.out.print("Informe o salário: R$");
                professor.setSalario(Float.parseFloat(scanner.nextLine()));
            }
        }

    }

    public void modificarFuncionario(int id) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getId() == id) {
                System.out.print("Informe o novo nome: ");
                funcionario.setNome(scanner.nextLine());

                System.out.print("Informe o novo CPF: ");
                funcionario.setCpf(scanner.nextLine());

                System.out.print("Informe o novo RG: ");
                funcionario.setRg(scanner.nextLine());

                System.out.print("Informe o novo cargo: ");
                funcionario.setCargo(scanner.nextLine());

                System.out.print("Informe o novo salário: R$");
                funcionario.setSalario(Float.parseFloat(scanner.nextLine()));
            }
        }

    }

    public void modificarAluno(int id) {
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        //modificarPessoa(nome);
        for (Aluno aluno : listaAlunos) {
            if (aluno.getId() == id) {
                System.out.print("Informe o novo nome: ");
                aluno.setNome(scanner.nextLine());

                System.out.print("Informe o novo CPF: ");
                aluno.setCpf(scanner.nextLine());

                System.out.print("Informe o novo RG: ");
                aluno.setRg(scanner.nextLine());

                System.out.print("Informe a nova idade: ");
                aluno.setIdade(Integer.parseInt(scanner.nextLine()));

                System.out.print("Informe a nova turma: ");
                aluno.setTurma(scanner.nextLine());
            }
        }

    }

    public void exibirProfessor(Professor professor) {
        System.out.println("-----PROFESSORES-----");
        exibirPessoa(professor);
        System.out.println("Disciplinas: ");
        System.out.println("Turmas: ");
        System.out.printf("Salário: R$%.2f\n", professor.getSalario());
    }

    public void exibirFuncionario(Funcionario funcionario) {
        System.out.println("-----FUNCIONÁRIOS-----");
        exibirPessoa(funcionario);

        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.printf("Salário: R$%.2f\n", funcionario.getSalario());
    }

    public void exibirAlunoComNota(Aluno aluno) {
        System.out.println("-----ALUNOS-----");
        exibirPessoa(aluno);
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Turma: " + aluno.getTurma());
        System.out.println("Notas:");
        listarNotas(aluno);
    }

    public void exibirAlunoSemNota(Aluno aluno) {
        System.out.println("-----ALUNOS-----");
        exibirPessoa(aluno);
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Turma: " + aluno.getTurma());
    }

    public void listarNotas(Aluno aluno) {
        for (int i = 0; i < 4; i++) {
            System.out.printf("Nota %dº semestre: %.2f\n", (i + 1), aluno.getNotasPorDisciplina().get(i));
        }
    }

    private void exibirPessoa(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("RG: " + pessoa.getRg());
    }

    public void listarAlunosComNota() {
        for (Aluno aluno : listaAlunos) {
            exibirAlunoComNota(aluno);
        }
    }

    public void listarAlunosSemNota() {
        for (Aluno aluno : listaAlunos) {
            exibirAlunoSemNota(aluno);
        }
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : listaFuncionarios) {
            exibirFuncionario(funcionario);
        }
    }

    public void listarProfessores() {
        for (Professor professor : listaProfessores) {
            exibirProfessor(professor);
        }
    }

    public void adicionarDisciplinaParaProfessor() {
        Scanner scanner = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();

        System.out.print("Digite o nome da disciplina: ");
        disciplina.setNome(scanner.nextLine());
        if (!listaTodasDisciplinas.contains(disciplina)) {
            listaTodasDisciplinas.add(disciplina);
            System.out.println("Disciplina registrada com sucesso!");

            System.out.print("Digite o identificador do professor: ");
            int id = scanner.nextInt();

            for (Professor professor : listaProfessores) {
                if (professor.getId() == id) {
                    listaDisciplinasPorProfessor.add(disciplina);
                    professor.setDisciplinas(listaDisciplinasPorProfessor);
                    break;
                }
            }
        } else {
            System.out.println("Disciplina já existe.");
        }

    }

    public void chamarRegistrarNotas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o id do aluno:");
        int id = scanner.nextInt();
        if (listaAlunos.contains(id)){
          for(Aluno aluno : listaAlunos){
              if (aluno.getId() == id){
                  registrarNotas(aluno);
              }
          }
        } else {
            System.out.println("Id inexistente.");
        }
    }

    public void registrarNotas(Aluno aluno) {
        Scanner scanner = new Scanner(System.in);
        List<Double> listaNotas = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.printf("Informe a %dª nota: \n", (i + 1));
            aluno.setNotaGenerica(Double.parseDouble(scanner.nextLine()));
            listaNotas.add(aluno.getNotaGenerica());
        }
    }

    private void cadastrarNovaPessoa() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastrando novo membro da escola. Escolha:");
        System.out.println("1- professor");
        System.out.println("2- funcionário");
        System.out.println("3- aluno");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                List<Professor> professores = new ArrayList<>();
                this.setListaProfessores(professores);
                adicionarProfessor();
                break;
            case 2:
                adicionarFuncionario();
                break;
            case 3:
                adicionarAluno();
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }

    public void mostrarMenu() {
        List<Professor> professores = new ArrayList<>();
        this.setListaProfessores(professores);
        List<Aluno> alunos = new ArrayList<>();
        this.setListaAlunos(alunos);
        List<Funcionario> funcionarios = new ArrayList<>();
        this.setListaFuncionarios(funcionarios);
        List<Pessoa> pessoas = new ArrayList<>();
        this.setListaPessoas(pessoas);
        Scanner scanner = new Scanner(System.in);
        int escolha = 1;
        do {
            System.out.println("Escolha uma ação:");
            System.out.println("1 = Realizar novo cadastro");
            System.out.println("2 = Modificar um cadastro");
            System.out.println("3 = Deletar um cadastro");
            System.out.println("4 = Adicionar disciplina para professor");
            System.out.println("5 = Registrar notas de um aluno");
            System.out.println("6 = Sair");
            {
                escolha = Integer.parseInt(scanner.nextLine());
                switch (escolha) {
                    case 1:
                        cadastrarNovaPessoa();
                        break;
                    case 2:
                        modificarCadastro();
                        break;
                    case 3:
                        deletarCadastro();
                        break;
                    case 4:
                        adicionarDisciplinaParaProfessor();
                        break;
                    case 5:
                        chamarRegistrarNotas();
                        break;
                    case 6:
                        System.out.println("Encerrando");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            }
        } while (escolha != 6);

    }

    public void modificarCadastro() {
        Scanner scanner = new Scanner(System.in);

        //String nome;
        int id;
        System.out.println("Modificando um membro da escola. Escolha:");
        System.out.println("1- professor");
        System.out.println("2- funcionário");
        System.out.println("3- aluno");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Informe o id do professor: ");
                id = scanner.nextInt();
                modificarProfessor(id);
                break;
            case 2:
                System.out.println("Informe o id do funcionário: ");
                id = scanner.nextInt();
                modificarFuncionario(id);
                break;
            case 3:
                System.out.println("Informe o id do aluno: ");
                id = scanner.nextInt();
                modificarAluno(id);
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }
    }

    public void deletarCadastro() {
        Scanner scanner = new Scanner(System.in);

        int id;

        System.out.println("Deletando um membro da escola. Escolha:");
        System.out.println("1- professor");
        System.out.println("2- funcionário");
        System.out.println("3- aluno");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Digite o id do professor: ");
                id = scanner.nextInt();
                deletarProfessor(id);
                break;
            case 2:
                System.out.println("Digite o id do funcionário: ");
                id = scanner.nextInt();
                deletarFuncionario(id);
                break;
            case 3:
                System.out.println("Digite o id do aluno: ");
                id = scanner.nextInt();
                deletarAluno(id);
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }
    }

    public void deletarAluno(int id) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getId() == id) {
                listaAlunos.remove(aluno);
                listaPessoas.remove(aluno);
                break;
            }
        }
    }

    public void deletarProfessor(int id) {
        for (Professor professor : listaProfessores) {
            if (professor.getId() == id) {
                listaProfessores.remove(professor);
                listaFuncionarios.remove(professor);
                listaPessoas.remove(professor);
                break;
            }
        }
    }

    public void deletarFuncionario(int id) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getId() == id) {
                listaFuncionarios.remove(funcionario);
                listaPessoas.remove(funcionario);
                break;
            }
        }
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    private void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<Professor> getListaProfessores() {
        return listaProfessores;
    }

    private void setListaProfessores(List<Professor> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    private void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    private void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public boolean verificaSeEProfessor(Funcionario funcionario) {
        if (funcionario instanceof Professor) {
            Professor professor = (Professor) funcionario;
            this.listaProfessores.add(professor);
            return true;
        }
        return false;
    }
}
