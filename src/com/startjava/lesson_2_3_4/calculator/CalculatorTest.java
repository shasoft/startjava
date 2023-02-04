package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "yes";
        do {
            try {
                if (answer.equals("yes")) {
                    System.out.println("Введите мат. выражение в следующем формате");
                    System.out.print("<целое число><пробел><операция><целое число>: ");
                    double result = Calculator.calculate(console.nextLine());
                    System.out.print("Результат операции = ");
                    System.out.printf(result % 1.0 != 0.0 ? "%f" : "%.0f", result);
                    System.out.println();
                }
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = console.nextLine();
            } catch (RuntimeException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        } while (!answer.equals("no"));
    }
}