package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final int COUNT_PLAYRES = 3;
    private static final int COUNT_ATTEMPTS = 10;
    private static final int COUNT_ROUNDS = 3;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Player[] players = createPlayers(console, COUNT_PLAYRES);
        GuessNumber game = new GuessNumber(players);
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start(COUNT_ROUNDS);
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = console.nextLine();
        } while (!answer.equals("no"));
    }

    private static Player[] createPlayers(Scanner console, int countPlayers) {
        Player[] players = new Player[countPlayers];
        for (int i = 0; i < countPlayers; i++) {
            players[i] = createPlayer(console, i + 1);
        }
        return players;
    }

    private static Player createPlayer(Scanner console, int playerNumber) {
        System.out.print("Введите имя игрока " + playerNumber + ": ");
        return new Player(console.nextLine(), COUNT_ATTEMPTS);
    }
}