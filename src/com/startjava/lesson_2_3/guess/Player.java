package com.startjava.lesson_2_3.guess;

public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return name;
    }
}