package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private int victory;
    private String name;
    private int countNumbers;
    private int[] numbers;

    public Player(String name, int maxNumbers) {
        this.name = name;
        numbers = new int[maxNumbers];
        reset();
    }

    public void reset() {
        Arrays.fill(numbers, 0, countNumbers, 0);
        countNumbers = 0;
    }

    public boolean addNumber(int number) {
        if (number < 1 || number > 100) {
            System.out.println("Число должно быть в интервале (0,100]");
            return false;
        }
        numbers[countNumbers++] = number;
        return true;
    }

    public void clearVictory() {
        victory = 0;
    }

    public void addVictory() {
        victory++;
    }

    public int getVictory() {
        return victory;
    }

    public int getAttempt() {
        return countNumbers;
    }

    public boolean hasAttempts() {
        return countNumbers < numbers.length;
    }

    public int getAttempts() {
        return numbers.length;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countNumbers);
    }

    public String toString() {
        return name;
    }
}