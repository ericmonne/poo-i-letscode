package com.company.aula02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ex01Run {
    public static void main(String[] args) {

        Jogador jogador01 = new Jogador(1, "Victor Valdés", "Doble V", LocalDate.of(1982, 01, 14), 1, "goleiro", 90, 0, 0);
        Jogador jogador02 = new Jogador(2, "Daniel Alves", "Dani Alves", LocalDate.of(1983, 05, 06), 20, "lateral", 88, 3, 0);
        Jogador jogador03 = new Jogador(3, "Gerard Piqué", "Presidente", LocalDate.of(1987, 02, 02), 4, "zagueiro", 86, 2, 0);
        Jogador jogador04 = new Jogador(4, "Carles Puyol", "Tarzan", LocalDate.of(1978, 04, 13), 5, "zagueiro", 92, 0, 0);
        Jogador jogador05 = new Jogador(5, "Eric Abidal", "Abi", LocalDate.of(1979, 9, 11), 22, "lateral", 85, 1, 0);
        Jogador jogador06 = new Jogador(6, "Xavier Hernandez", "Xavi", LocalDate.of(1980, 01, 25), 6, "meio-campo", 94, 0, 0);
        Jogador jogador07 = new Jogador(7, "Andrés Iniesta", "Don Andrés", LocalDate.of(1984,05,11), 8, "meio-campo", 93, 1, 0);
        Jogador jogador08 = new Jogador(8, "Yaya Touré", "Bisão", LocalDate.of(1983, 05, 13), 24, "meio-campo", 89, 1, 0);
        Jogador jogador09 = new Jogador(9, "Samuel Eto'o", "Chacal", LocalDate.of(1981, 03, 10), 9, "atacante", 91, 0, 0);
        Jogador jogador10 = new Jogador(10, "Lionel Messi", "D10s", LocalDate.of(1987, 06, 24), 10, "atacante", 99, 0, 0);
        Jogador jogador11 = new Jogador(11, "Thierry Henry", "Tití", LocalDate.of(1977,8,17), 14, "atacante", 91, 1, 0);

        List<Jogador> barcelona = new ArrayList<Jogador>();

        barcelona.add(jogador01);
        barcelona.add(jogador02);
        barcelona.add(jogador03);
        barcelona.add(jogador04);
        barcelona.add(jogador05);
        barcelona.add(jogador06);
        barcelona.add(jogador07);
        barcelona.add(jogador08);
        barcelona.add(jogador09);
        barcelona.add(jogador10);
        barcelona.add(jogador11);

        jogador03.aplicarCartaoAmarelo(1);
        jogador11.aplicarCartaoVermelho();
        //jogador11.cumprirSuspensao();
        //jogador03.cumprirSuspensao();

        for(Jogador jogador : barcelona){
            System.out.println(jogador.toString());
        }

        for (Jogador jogador: barcelona
             ) {
            jogador.sofrerLesao();
            System.out.printf("%s: %d\n", jogador.nome, jogador.qualidade);
            jogador.executarTreinamento();
            System.out.printf("%s: %d\n", jogador.nome, jogador.qualidade);
            jogador.cumprirSuspensao();
            jogador.jogar();
            jogador.executarTreinamento();
            System.out.printf("%s: %d\n", jogador.nome, jogador.qualidade);
        }

        for (Jogador jogador : barcelona
             ) {
            System.out.println(jogador.toString());
        }


//        System.out.println(jogador01.qualidade);
//        jogador01.sofrerLesao();
//        System.out.println(jogador01.qualidade);
//        jogador01.executarTreinamento();
//        System.out.println(jogador01.qualidade);
    }
}
