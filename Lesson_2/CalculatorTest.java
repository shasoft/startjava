import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Calculator calculator = new Calculator();
        String answer;
        do {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(console.nextInt());

            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(console.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setNumber2(console.nextInt());

            calculator.calculate();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}