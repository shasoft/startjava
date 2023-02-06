package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private int countWins;
    private String name;
    private int countAttempts;
    private int[] numbers;

    public Player(String name, int maxNumbers) {
        this.name = name;
        numbers = new int[maxNumbers];
        countAttempts = 0;
    }

    public void reset() {
        Arrays.fill(numbers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public boolean addNumber(int number) {
        if (number < 1 || number > 100) {
            System.out.println("Число должно быть в интервале (0,100]");
            return false;
        }
        numbers[countAttempts++] = number;
        return true;
    }

    public void clearCountWins() {
        countWins = 0;
    }

    public void upCountWins() {
        countWins++;
    }

    public int getCountWins() {
        return countWins;
    }

    public int getAttempt() {
        return countAttempts;
    }

    public boolean hasAttempts() {
        return countAttempts < numbers.length;
    }

    public int getAttempts() {
        return numbers.length;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countAttempts);
    }

    public String toString() {
        return name;
    }
}