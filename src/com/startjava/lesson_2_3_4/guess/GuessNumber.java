package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player[] players;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void start() {
        int secretNumber = getSecretNumber();
        System.out.println("У каждого игрока по " + players[0].maxAttempts() + " попыток");
        for (Player player : players) {
            player.reset();
        }
        int countPlayersAttempts = players.length;
        int numPlayer = 0;
        Scanner console = new Scanner(System.in);
        while (countPlayersAttempts > 0) {
            Player activePlayer = players[numPlayer];
            if (activePlayer.hasAttempts()) {
                System.out.print("Игрок " + activePlayer + " введите число: ");
                int number = console.nextInt();
                activePlayer.addNumber(number);
                if (number == secretNumber) {
                    System.out.println("Игрок " + activePlayer + " угадал число " + secretNumber + " с "
                            + activePlayer.attempt() + " попытки");
                    break;
                }
                if (number < secretNumber) {
                    System.out.println("Число " + number + " меньше того, что загадал компьютер");
                } else {
                    System.out.println("Число " + number + " больше того, что загадал компьютер");
                }
            } else {
                System.out.println("У " + activePlayer + " закончились попытки");
                countPlayersAttempts--;
            }
            numPlayer++;
            if (numPlayer == players.length) {
                numPlayer = 0;
            }
        }
        printNumbers();
    }

    public int getSecretNumber() {
        return (int) (Math.random() * 100.0f) + 1;
    }

    public void printNumbers() {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Числа игрока " + players[i] + ":");
            System.out.print("\t");
            for (int number : players[i].getNumbers()) {
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
    }
}