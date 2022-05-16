package com.company.aula05;

import java.util.Random;

public class Protagonista {

    protected Random random = new Random();


    protected int pontosDeVida = 300;

    protected int forca = random.nextInt(50);
    protected Dano perfuracao = new Dano((forca + 10), "perfurante");
    protected Dano padrao = new Dano((forca + 15), "corte");
    protected Dano pancada = new Dano((forca + 10), "pancada");
    protected Dano ataqueDeFogo = new Dano((forca + 20), "fogo");

    protected boolean sangrando = false;
    protected boolean envenenado = false;
    private boolean vivo = true;

    protected String nome;

    public Protagonista(String nome) {
        this.nome = nome;
    }

    public Protagonista() {
    }

    private Dano sortearAtaque(){
        Dano[] danos = new Dano[4];
        danos[0] = padrao;
        danos[1] = perfuracao;
        danos[2] = pancada;
        danos[3] = ataqueDeFogo;
        int i = random.nextInt(0,4);
        return danos[i];
    }

    public Dano atacar(){
        Dano dano = sortearAtaque();
        perderVidaPorVeneno();
        return dano;
    }

    protected void sangrar(){
        if(this.isSangrando() && this.isVivo()){
            this.setPontosDeVida(this.getPontosDeVida() - 5);
            //System.out.println(this.getNome() + " está sangrando.");
        }
    }

    protected void perderVidaPorVeneno(){
        if(this.isEnvenenado() && this.isVivo()){
            this.setPontosDeVida(this.getPontosDeVida() - 10);
            //System.out.println(this.getNome() + " está envenenado.");
        }
    }

    public void verificarVida() {
        if(this.getPontosDeVida()<=0){
            this.setVivo(false);
            this.setPontosDeVida(0);
            System.out.println("Você perdeu! Fim de jogo!");
        }
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    protected void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public boolean isSangrando() {
        return sangrando;
    }

    public void setSangrando(boolean sangrando) {
        this.sangrando = sangrando;
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
