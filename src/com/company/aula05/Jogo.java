package com.company.aula05;

import java.util.Scanner;

public class Jogo {

    protected void jogar() {
        Scanner scanner = new Scanner(System.in);

        Generico generico = new Generico();
        Vampiro vampiro = new Vampiro();
        Cobra cobra = new Cobra();
        Gigante gigante = new Gigante();
        Protagonista protagonista = new Protagonista();
        System.out.println("Qual o nome do herói?");
        protagonista.setNome(scanner.nextLine());

        generico.interagir(protagonista);
        while (generico.isVivo() && protagonista.isVivo()) {
            generico.verificarVida();
            System.out.println("Vida do inimigo: " + generico.getPontosDeVida());
            System.out.printf("Vida do %s: %d\n", protagonista.getNome(), protagonista.getPontosDeVida());
            generico.atacar(protagonista);
            protagonista.verificarVida();
            generico.apanhar(protagonista);
        }

        if (protagonista.isVivo()) {
            gigante.interagir(protagonista);
        }

        while (gigante.isVivo() && protagonista.isVivo()) {
            System.out.println("Vida do gigante: " + gigante.getPontosDeVida());
            System.out.printf("Vida do %s: %d\n", protagonista.getNome(), protagonista.getPontosDeVida());
            gigante.verificarVida();
            gigante.atacar(protagonista);
            protagonista.verificarVida();
            gigante.apanhar(protagonista);
        }

        if (protagonista.isVivo()) {
            cobra.interagir(protagonista);
        }

        while (cobra.isVivo() && protagonista.isVivo()) {
            System.out.println("Vida da cobra: " + cobra.getPontosDeVida());
            System.out.printf("Vida do %s: %d\n", protagonista.getNome(), protagonista.getPontosDeVida());
            cobra.verificarVida();
            cobra.atacar(protagonista);
            protagonista.verificarVida();
            cobra.apanhar(protagonista);
        }

        if (protagonista.isVivo()) {
            vampiro.interagir(protagonista);
        }

        while (vampiro.isVivo() && protagonista.isVivo()) {
            System.out.println("Vida do vampiro: " + vampiro.getPontosDeVida());
            System.out.printf("Vida de %s: %d\n", protagonista.getNome(), protagonista.getPontosDeVida());
            vampiro.verificarVida();
            vampiro.atacar(protagonista);
            protagonista.verificarVida();
            vampiro.apanhar(protagonista);
        }

        if(protagonista.isVivo()){
            System.out.println("PARABÉNS, VOCÊ DERROTOU TODOS OS INIMIGOS");
        }
    }

}
