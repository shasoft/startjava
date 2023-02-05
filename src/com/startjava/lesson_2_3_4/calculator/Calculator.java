package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static public double calculate(String expression) {
        String[] partsExpression = expression.split(" ", 3);
        char operation;
        double number1, number2;
        try {
            number1 = (double) Integer.parseInt(partsExpression[0]);
            operation = partsExpression[1].charAt(0);
            number2 = (double) Integer.parseInt(partsExpression[2]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат ввода выражения");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NumberFormatException("Неверный формат ввода выражения");
        }
        if (number1 < 0.0 || number2 < 0.0) {
            throw new RuntimeException("Можно вводить только положительные числа");
        }
        return switch (operation) {
            case '+' -> (number1 + number2);
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            case '/' -> number1 / number2;
            case '^' -> Math.pow(number1, number2);
            case '%' -> number1 % number2;
            default -> throw new RuntimeException("Поддерживаются только операции +, -, *, /, ^, %");
        };
    }
}