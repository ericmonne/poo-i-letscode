package com.company.aula05;

public abstract class Inimigo {
    Dano dano;
    int pontosDeVida;

    public Inimigo(Dano dano, int pontosDeVida) {
        this.dano = dano;
        this.pontosDeVida = pontosDeVida;
    }

    public Inimigo() {
    }

    protected abstract void atacar(Protagonista protagonista);

    protected abstract void apanhar(Protagonista protagonista) ;

    protected abstract void interagir(Protagonista protagonista);

    protected abstract void verificarVida();

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }
}
