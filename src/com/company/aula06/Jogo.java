package com.company.aula06;

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

        generico.inicializarInteracao(protagonista);
        while (generico.isVivo() && protagonista.isVivo()) {
            System.out.println("Vida do inimigo: " + generico.getPontosDeVida());
            System.out.printf("Vida de %s: %d\n", protagonista.getNome(), protagonista.getPontosDeVida());
            generico.verificarVida();
            generico.atacar(protagonista);
            generico.apanhar(protagonista);
        }

        gigante.inicializarInteracao(protagonista);
        while (gigante.isVivo() && protagonista.isVivo()) {
            System.out.println("Vida do gigante: " + gigante.getPontosDeVida());
            System.out.printf("Vida de %s: %d\n", protagonista.getNome(), protagonista.getPontosDeVida());
            gigante.verificarVida();
            gigante.atacar(protagonista);
            gigante.apanhar(protagonista);
        }

        cobra.inicializarInteracao(protagonista);
        while (cobra.isVivo() && protagonista.isVivo()) {
            System.out.println("Vida da cobra: " + cobra.getPontosDeVida());
            System.out.printf("Vida de %s: %d\n", protagonista.getNome(), protagonista.getPontosDeVida());
            cobra.verificarVida();
            cobra.atacar(protagonista);
            cobra.apanhar(protagonista);
        }

        vampiro.inicializarInteracao(protagonista);
        while (vampiro.isVivo() && protagonista.isVivo()) {
            System.out.println("Vida do vampiro: " + vampiro.getPontosDeVida());
            System.out.printf("Vida de %s: %d\n", protagonista.getNome(), protagonista.getPontosDeVida());
            vampiro.verificarVida();
            vampiro.atacar(protagonista);
            vampiro.apanhar(protagonista);
        }

        if (protagonista.isVivo()) {
            System.out.println("PARABÉNS, VOCÊ DERROTOU TODOS OS INIMIGOS");
        }
    }

}
