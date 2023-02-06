package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private int secretNumber;
    private Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start(int countVictorys) {
        for (Player player : this.players) {
            player.clearVictory();
        }

        mixPlayers();

        for (int i = 0; i < countVictorys; i++) {
            playRound();
        }

        System.out.println("Количество побед каждого игрока:");
        for (Player player : players) {
            System.out.println("\t" + player.getVictory() + " " + player);
        }
    }

    private void mixPlayers() {
        Player[] players = Arrays.copyOf(this.players, this.players.length);
        int count = players.length;
        do {
            int numPlayer = (int) (Math.random() * (double) count);
            count--;
            this.players[count] = players[numPlayer];
            players[numPlayer] = players[count];
        } while (count > 0);
    }

    private void playRound() {
        secretNumber = (int) (Math.random() * 100.0f) + 1;
        System.out.println("У каждого игрока по " + players[0].getAttempts() + " попыток");
        for (Player player : players) {
            player.reset();
        }
        int countActivePlayers = players.length;
        int numPlayer = 0;
        while (countActivePlayers > 0) {
            Player activePlayer = players[numPlayer];
            if (activePlayer.hasAttempts()) {
                int number = inputNumber(activePlayer);
                if (checkVictory(activePlayer, number)) {
                    activePlayer.addVictory();
                    break;
                }
                System.out.println("\tЧисло " + number + " " + (number < secretNumber ? "меньше" : "больше")
                        + " того, что загадал компьютер");
            } else {
                System.out.println("У " + activePlayer + " закончились попытки");
                countActivePlayers--;
            }
            numPlayer++;
            if (numPlayer == players.length) {
                numPlayer = 0;
            }
        }
        printNumbers();
    }

    private int inputNumber(Player player) {
        int number;
        Scanner console = new Scanner(System.in);
        do {
            System.out.print("Игрок " + player + " введите число: ");
            number = console.nextInt();
        } while (!player.addNumber(number));
        return number;
    }

    private boolean checkVictory(Player player, int number) {
        boolean hasVictory = false;
        if (number == secretNumber) {
            System.out.println("Игрок " + player + " угадал число " + secretNumber + " с "
                    + player.getAttempt() + " попытки");
            hasVictory = true;
        }
        return hasVictory;
    }

    private void printNumbers() {
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