package com.company.aula06;

import java.util.Random;

public class Vampiro extends Inimigo {

    protected Dano dano = new Dano(20);
    private int pontosDeVida = 150;
    private boolean sugandoSangue = false;
    private boolean vivo = true;

    public Vampiro(Dano dano, int pontosDeVida) {
        super(dano, pontosDeVida);
    }

    public Vampiro() {
    }

    @Override
    public void atacar(Protagonista protagonista) {
        this.verificarVida();
        protagonista.verificarVida();
        if (this.isVivo() && protagonista.isVivo()) {
            System.out.printf("Causou %d de dano.\n", dano.getValor());
            fazerSangrar(protagonista);
            sugarSangue(protagonista);
            if (protagonista.isSangrando()) {
                System.out.println(protagonista.getNome() + " está sangrando.");
            }
            protagonista.setPontosDeVida(protagonista.getPontosDeVida() - dano.getValor());
        }
    }

    @Override
    public void apanhar(Protagonista protagonista) {
        protagonista.verificarVida();
        if (protagonista.isVivo()) {
            Dano danoRecebido = protagonista.atacar();
            int valorDanoRecebido = danoRecebido.getValor();
            String tipoDanoRecebido = danoRecebido.getTipo();
            if (tipoDanoRecebido.equalsIgnoreCase("perfurante")) {
                valorDanoRecebido = valorDanoRecebido * 2;
            }
            System.out.printf("Vampiro recebeu %d de dano\n", valorDanoRecebido);
            this.setPontosDeVida(this.getPontosDeVida() - valorDanoRecebido);
            sugarSangue(protagonista);
            verificarVida();
        }
        if (!this.isVivo()) {
            System.out.println("Vampiro derrotado!");
        }
    }

    @Override
    protected void interagir(Protagonista protagonista) {
        System.out.println("-----*****-----");
        System.out.println("Vampiro diz: O que é um homem?");
        System.out.println("-----*****-----");
    }

    private boolean fazerSangrar(Protagonista protagonista) {
        Random random = new Random();
        int sangue = random.nextInt(2);
        if (sangue == 1) {
            protagonista.setSangrando(true);
            this.sugandoSangue = true;
            return true;
        } else {
            return false;
        }
    }

    protected void sugarSangue(Protagonista protagonista) {
        if (sugandoSangue) {
            this.setPontosDeVida(this.getPontosDeVida() + 5);
            protagonista.sangrar();
        }
    }

    @Override
    public void verificarVida() {
        if (this.getPontosDeVida() <= 0) {
            this.setVivo(false);
            this.setPontosDeVida(0);
        }
    }

    @Override
    protected void inicializarInteracao(Protagonista protagonista) {
        if (protagonista.isVivo()) {
            this.interagir(protagonista);
        }
    }

    @Override
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public Dano getDano() {
        return dano;
    }

    public void setDano(Dano dano) {
        this.dano = dano;
    }
}
