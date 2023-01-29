package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int number1;
    private char operation;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void calculate() {
        int result = 0;
        switch (operation) {
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
                result = 1;
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
                break;
            case '%':
                result = number1 % number2;
                break;
            default:
                System.out.println("Операция не поддерживается!");
                return;
        }
        System.out.println("Результат операции " + number1 + " " + operation + " " + number2 + " = " + result);
    }

}