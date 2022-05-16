package com.company.aula05;

public class Gigante extends Inimigo {

    Dano dano = new Dano(25);
    private int pontosDeVida = 200;
    private boolean vivo = true;

    public Gigante(Dano dano, int pontosDeVida) {
        super(dano, pontosDeVida);
    }

    public Gigante() {
    }

    @Override
    public void atacar(Protagonista protagonista) {
        this.verificarVida();
        protagonista.verificarVida();
        if (this.isVivo() && protagonista.isVivo()) {
            System.out.printf("Causou %d de dano.\n", dano.getValor());
            System.out.println("Seu personagem está atordoado.");
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
            if (tipoDanoRecebido.equalsIgnoreCase("fogo")) {
                valorDanoRecebido = valorDanoRecebido * 2;
            }
            System.out.printf("Gigante recebeu %d de dano\n", valorDanoRecebido);
            this.setPontosDeVida(this.getPontosDeVida() - valorDanoRecebido);
            verificarVida();
        }
        if (!this.isVivo()) {
            System.out.println("Gigante derrotado!");
        }
    }

    @Override
    public void interagir(Protagonista protagonista) {
        System.out.println("-----*****-----");
        System.out.println("Gigante diz: Me desculpe.");
        System.out.println("-----*****-----");
    }

    public Dano getDano() {
        return dano;
    }

    public void setDano(Dano dano) {
        this.dano = dano;
    }

    @Override
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    @Override
    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    @Override
    protected void verificarVida() {
        if (this.getPontosDeVida() <= 0) {
            this.setVivo(false);
            this.setPontosDeVida(0);
        }
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
