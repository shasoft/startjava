package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int countNumbers;
    private int[] numbers;

    public Player(String name, int maxNumbers) {
        this.name = name;
        numbers = new int[maxNumbers];
        countNumbers = 0;
    }

    public void reset() {
        Arrays.fill(numbers, 0, countNumbers, 0);
        countNumbers = 0;
    }

    public void addNumber(int number) {
        numbers[countNumbers++] = number;
    }

    public int attempt() {
        return countNumbers;
    }

    public boolean hasAttempts() {
        return countNumbers < numbers.length;
    }

    public int maxAttempts() {
        return numbers.length;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, countNumbers);
    }

    public String toString() {
        return name;
    }
}