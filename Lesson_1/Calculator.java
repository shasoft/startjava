public class Calculator {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 0;
        char operation = '^';

        int result = 0;
        if (operation == '+') {
            result = number1 + number2;
        } else if (operation == '-') {
            result = number1 - number2;
        } else if (operation == '*') {
            result = number1 * number2;
        } else if (operation == '/') {
            result = number1 / number2;
        } else if (operation == '^') {
            result = 1;
            for (int i = 0; i < number2; i++) {
                result *= number1;
            }
        } else if (operation == '%') {
            result = number1 % number2;
        }

        System.out.println("Результат операции " + number1 + " " + operation + " " + number2 + " = " + result);
    }
}