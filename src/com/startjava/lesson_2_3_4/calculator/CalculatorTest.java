package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Calculator calculator = new Calculator();
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                answer = console.nextLine();
                double result = calculator.calculate(answer);
                System.out.print("Результат операции = ");
                if (result % 1.0 != 0.0)
                    System.out.printf("%f", result);
                else
                    System.out.printf("%.0f", result);
                System.out.println();
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = console.nextLine();

        } while (!answer.equals("no"));
    }
}