package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers(console, 2));
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = console.nextLine();
        } while (!answer.equals("no"));
    }

    public static Player createPlayer(Scanner console, int playerNumber) {
        System.out.print("Введите имя игрока " + playerNumber + ": ");
        return new Player(console.nextLine(), 10);
    }

    public static Player[] createPlayers(Scanner console, int countPlayers) {
        Player[] ret = new Player[countPlayers];
        for (int i = 0; i < countPlayers; i++) {
            ret[i] = createPlayer(console, i + 1);
        }
        return ret;
    }
}