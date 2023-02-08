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

        printPlayScores();
    }

    private void mixPlayers() {
        int length = players.length;
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * (double) length);
            if (i != index) {
                Player player = players[index];
                players[index] = players[i];
                players[i] = player;
            }
        }
    }

    private void playRound() {
        secretNumber = (int) (Math.random() * 100.0f) + 1;
        System.out.println("У каждого игрока по " + players[0].getAttempts() + " попыток " + secretNumber);
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

    private void printPlayScores() {
        int len = players.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (players[i].getCountWins() < players[j].getCountWins()) {
                    Player player = players[i];
                    players[i] = players[j];
                    players[j] = player;
                }
            }
        }
        if (players[0].getCountWins() == players[len - 1].getCountWins())
            System.out.println("Ничья");
        else {
            if (players[0].getCountWins() == players[1].getCountWins()) {
                System.out.println("Победу одержали: ");
                for (int i = 0; players[i].getCountWins() == players[0].getCountWins(); i++) {
                    System.out.println("\t" + players[i] + " (побед=" + players[i].getCountWins() + ")");
                }
            } else {
                System.out.println("Победу одержал " + players[0] + " (побед=" + players[0].getCountWins() + ")");
            }
        }
    }
}