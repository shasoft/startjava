package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static public double calculate(String expression) {
        String[] partsExpression = expression.split(" ", 3);
        try {
            double number1 = (double) Integer.parseInt(partsExpression[0]);
            double number2 = (double) Integer.parseInt(partsExpression[2]);
            return switch (partsExpression[1].charAt(0)) {
                case '+' -> (number1 + number2);
                case '-' -> number1 - number2;
                case '*' -> number1 * number2;
                case '/' -> number1 / number2;
                case '^' -> Math.pow(number1, number2);
                case '%' -> number1 % number2;
                default -> throw new RuntimeException("Операция не поддерживается!");
            };
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат ввода выражения!");
        }
    }
}