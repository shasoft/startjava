package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String expression) {
        String[] portions = expression.split(" ", 3);
        double number1 = (double) Integer.parseInt(portions[0]);
        double number2 = (double) Integer.parseInt(portions[2]);
        double result = 0f;
        switch (portions[1].charAt(0)) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '^':
                result = Math.pow(number1, number2);
                break;
            case '%':
                result = number1 % number2;
                break;
            default:
                System.out.println("Операция не поддерживается!");
        }
        return result;
    }

}