package com.startjava.lesson_1.final;

public class GuessNumber {
    public static void main(String[] args) {
        int secretNum = 10;
        int playerNumber = 50;

        while (playerNumber != secretNum) {
            if (playerNumber > secretNum) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                playerNumber--;
            } else {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                playerNumber++;
            }
        }

        System.out.println("Вы победили!");
    }
}