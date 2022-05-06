package com.company.aula02;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Jogador {
    Random random = new Random();

    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    boolean suspenso;

    boolean treinado = false;

    public Jogador() {
    }

    public Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao, int qualidade, int cartoesAmarelos, int cartaoVermelho, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartaoVermelho = cartaoVermelho;
        this.suspenso = suspenso;
    }

    boolean verificarCondicaoDeJogo(){
        if(cartaoVermelho > 0 || cartoesAmarelos >= 3){
            this.suspenso = true;
            return false;
        } else {
            this.suspenso = false;
            return  true;
        }
    }

    String verificarCondicaoDeJogoToString(){
        verificarCondicaoDeJogo();
        if(this.suspenso){
            return "NÃO PODE JOGAR";
        }
        else {
            return "PODE JOGAR";
        }
    }

    @Override
    public String toString(){
        return this.posicao + ": " + this.numero + " - "
                + this.nome + " (" + this.apelido + ") - "
                + this.dataNascimento + " CONDIÇÃO: " + verificarCondicaoDeJogoToString();
    }

    void aplicarCartaoAmarelo(int quantidade){
        this.cartoesAmarelos += quantidade;
        this.verificarCondicaoDeJogo();
    }


    void aplicarCartaoVermelho(){
        this.cartaoVermelho++;
        this.suspenso = true;
    }

    void cumprirSuspensao(){
           this.cartaoVermelho = 0;
           this.cartoesAmarelos = 0;
           this.suspenso = false;
    }

    void sofrerLesao(){
        double gravidade = random.nextDouble(0,1);
        if(gravidade <= 0.4){
            this.qualidade--;
        } else if(gravidade <= 0.7){
            this.qualidade = this.qualidade - 2;
        } else if(gravidade <= 0.85){
            this.qualidade = this.qualidade - (int)(this.qualidade * 0.05);
        } else if(gravidade <= 0.95){
            this.qualidade = this.qualidade - (int)(this.qualidade * 0.1);
        } else if(gravidade <=1){
            this.qualidade = this.qualidade - (int)(this.qualidade * 0.15);
        }
    }

    void executarTreinamento(){
        if(!this.treinado){
            this.qualidade += random.nextInt(1,4);
            this.treinado = true;
        }
    }

    void jogar(){
        this.treinado = false;
    }
}
