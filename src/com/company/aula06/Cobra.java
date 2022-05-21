package com.company.aula06;

import java.util.Random;

public class Cobra extends Inimigo {

    Dano dano = new Dano(10);
    private int pontosDeVida = 80;
    private boolean vivo = true;

    public Cobra(Dano dano, int pontosDeVida) {
        super(dano, pontosDeVida);
    }

    public Cobra() {
    }

    @Override
    public void atacar(Protagonista protagonista) {
        this.verificarVida();
        protagonista.verificarVida();
        if (this.isVivo() && protagonista.isVivo()) {
            System.out.printf("Causou %d de dano.\n", dano.getValor());
            protagonista.setPontosDeVida(protagonista.getPontosDeVida() - dano.getValor());
            envenenar(protagonista);
            if (protagonista.isEnvenenado()) {
                System.out.println(protagonista.getNome() + " está envenenado.");
                protagonista.perderVidaPorVeneno();
            }
        }
    }

    @Override
    public void apanhar(Protagonista protagonista) {
        protagonista.verificarVida();
        if (protagonista.isVivo()) {
            Dano danoRecebido = protagonista.atacar();
            int valorDanoRecebido = danoRecebido.getValor();
            String tipoDanoRecebido = danoRecebido.getTipo();
            if (tipoDanoRecebido.equalsIgnoreCase("pancada")) {
                valorDanoRecebido = valorDanoRecebido * 2;
            }
            System.out.printf("Cobra recebeu %d de dano\n", valorDanoRecebido);
            this.setPontosDeVida(this.getPontosDeVida() - valorDanoRecebido);
            verificarVida();
        }
        if (!this.isVivo()) {
            System.out.println("Cobra derrotada!");
        }
    }

    @Override
    protected void interagir(Protagonista protagonista) {
        System.out.println("-----*****-----");
        System.out.println("Cobra diz: Se você acender a chama, a maldição acaba.");
        System.out.println("-----*****-----");
    }

    @Override
    protected void verificarVida() {
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

    private boolean envenenar(Protagonista protagonista) {
        Random random = new Random();
        int veneno = random.nextInt(2);
        if (veneno == 1) {
            protagonista.setEnvenenado(true);
            return true;
        } else {
            return false;
        }
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }
}
