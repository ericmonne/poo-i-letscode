package com.company.aula06;

public class Generico extends Inimigo {

    Dano dano = new Dano(10);
    private int pontosDeVida = 100;
    private boolean vivo = true;

    public Generico(Dano dano, int pontosDeVida) {
        super(dano, pontosDeVida);

    }

    public Generico() {
    }

    @Override
    public void atacar(Protagonista protagonista) {
        verificarVida();
        protagonista.verificarVida();
        if (this.isVivo() && protagonista.isVivo()) {
            System.out.printf("Causou %d de dano.\n", dano.getValor());
            protagonista.setPontosDeVida(protagonista.getPontosDeVida() - dano.getValor());
        }
    }

    @Override
    public void apanhar(Protagonista protagonista) {
        protagonista.verificarVida();
        if (protagonista.isVivo()) {
            Dano danoRecebido = protagonista.atacar();
            int valorDanoRecebido = danoRecebido.getValor();
            System.out.printf("Inimigo recebeu %d de dano\n", valorDanoRecebido);
            this.setPontosDeVida(this.getPontosDeVida() - valorDanoRecebido);
            verificarVida();
        }
        if (!this.isVivo()) {
            System.out.println("Inimigo derrotado!");
        }
    }

    @Override
    protected void interagir(Protagonista protagonista) {
        System.out.println("-----*****-----");
        System.out.println("Inimigo diz: Por que eu responderia meu inimigo???");
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

    public Dano getDano() {
        return dano;
    }

    public void setDano(Dano dano) {
        this.dano = dano;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
