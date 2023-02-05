package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double result = 0.0;
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.println("Введите мат. выражение в следующем формате");
                System.out.print("<целое число><пробел><операция><целое число>: ");
                try {
                    result = Calculator.calculate(console.nextLine());
                    System.out.printf("Результат операции = " + (result % 1.0 != 0.0 ? "%f" : "%.0f\n"), result);
                } catch (RuntimeException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = console.nextLine();
        } while (!answer.equals("no"));
    }
}