package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayer(console, 1), createPlayer(console, 2));
        String answer;
        do {
            game.start(console);
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }

    public static Player createPlayer(Scanner console, int playerNumber) {
        System.out.print("Введите имя игрока " + playerNumber + ": ");
        return new Player(console.nextLine());
    }
}