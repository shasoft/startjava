import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Calculator calculator = new Calculator();
        String nextCalculate;
        do {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(keyboard.nextInt());

            System.out.print("Введите знак математической операции: ");
            calculator.setOperation(keyboard.next().charAt(0));

            System.out.print("Введите второе число: ");
            calculator.setNumber2(keyboard.nextInt());

            calculator.run();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                nextCalculate = keyboard.next();
                System.out.println(nextCalculate);
            } while (!nextCalculate.equals("yes") && !nextCalculate.equals("no"));
        } while (nextCalculate.equals("yes"));
    }
}