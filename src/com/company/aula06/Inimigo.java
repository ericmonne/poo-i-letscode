package com.company.aula06;

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

    abstract void interagir(Protagonista protagonista);

    protected abstract void verificarVida();

    protected abstract void inicializarInteracao(Protagonista protagonista);

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }
}
