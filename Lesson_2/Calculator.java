public class Calculator {
    private int number1 = 0;
    private char operation = '*';
    private int number2 = 0;

    public void setNumber1(int value) {
        number1 = value;
    }

    public void setOperation(char value) {
        operation = value;
    }

    public void setNumber2(int value) {
        number2 = value;
    }

    public void run() {
        int result = 0;
        switch(operation)
        {
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
            case '^': {
                result = 1;
                for (int i = 0; i < number2; i++) {
                    result *= number1;
                }
            }
            break;
            case '%':
                result = number1 % number2;
            break;
            default:
                operation = ' ';
        }
        if(operation!=' ') {
                System.out.println("Результат операции " + number1 + " " + operation + " " + number2 + " = " + result);
        }
    }

}