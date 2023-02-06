package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player[] players;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void start(int countRounds) {
        for (Player player : players)
            player.clearCountWins();

        mixPlayers();

        while (countRounds > 0) {
            playRound();
            countRounds--;
        }

        System.out.println("Количество побед каждого игрока:");
        for (Player player : players) {
            System.out.println("\t" + player.getCountWins() + " " + player);
        }
    }

    private void mixPlayers() {
        int length = players.length;
        int count = 2 * length;
        while (count > 0) {
            int numPlayer1 = (int) (Math.random() * (double) length);
            int numPlayer2 = (int) (Math.random() * (double) length);
            if (numPlayer1 != numPlayer2) {
                Player player = players[numPlayer1];
                players[numPlayer1] = players[numPlayer2];
                players[numPlayer2] = player;
                count--;
            }
        }
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
                if (isGuessed(activePlayer, number)) {
                    activePlayer.upCountWins();
                    break;
                }
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

    private boolean isGuessed(Player player, int number) {
        if (number == secretNumber) {
            System.out.println("Игрок " + player + " угадал число " + secretNumber + " с "
                    + player.getAttempt() + " попытки");
            return true;
        }
        System.out.println("\tЧисло " + number + " " + (number < secretNumber ? "меньше" : "больше")
                + " того, что загадал компьютер");
        return false;
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