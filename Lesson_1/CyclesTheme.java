import java.util.Arrays;

public class CyclesTheme {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int a = -10;
        int b = 21;
        int i = a;
        int X = 0; // Четные числа
        int Y = 0; // Нечетные числа
        do {
            if ((i % 2) == 0) {
                X++;
            } else {
                Y++;
            }
            // Увеличить число
            i++;
        } while (i <= b);
        System.out.println("\tв промежутке [" + a + ", " + b + "] сумма четных чисел = " + X + ", а нечетных = " + Y);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int[] numbers = new int[] { 10, 5, -1 };
        // Отсортировать
        for (i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    // Поменять местами
                    numbers[i] += numbers[j];
                    numbers[j] = numbers[i] - numbers[j];
                    numbers[i] -= numbers[j];
                }
            }
        }
        // Вывести
        for (i = 0; i < numbers.length; i++) {
            System.out.println("\t" + numbers[i]);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        X = 1234;
        int summaNumbers = 0;
        System.out.print("\tВ обратном порядке: ");
        while (X > 0) {
            System.out.print(X % 10);
            summaNumbers += (X % 10);
            X /= 10;
        }
        System.out.println("\n\tСумма цифр: " + summaNumbers);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        System.out.print("\t");
        int countNumbersInRow = 0;
        for (i = 1; i < 24; i += 2) {
            System.out.printf(" %2d", i);
            countNumbersInRow++;
            if (countNumbersInRow == 5) {
                System.out.print("\n\t");
                countNumbersInRow = 0;
            }
        }
        while (countNumbersInRow < 5) {
            System.out.printf(" %2d", 0);
            countNumbersInRow++;
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        X = 3242592;
        int countDvoek = 0;
        i = X;
        while (i > 0) {
            Y = i % 10;
            if (Y == 2) {
                countDvoek++;
            }
            i /= 10;
        }
        System.out.println("\tчисло " + X + " содержит " +
                countDvoek +
                " (" + ((countDvoek % 2) == 0 ? "четное" : "нечетное") + ") количество двоек");
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n6. Отображение фигур в консоли");
        // Прямоугольник
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Треугольник
        i = 5;
        while (i >= 0) {
            int j = i;
            while (j >= 0) {
                System.out.print("#");
                j--;
            }
            i--;
            System.out.println();
        }
        System.out.println();
        // Треугольник 2
        i = 5;
        do {
            int j = (i <= 3) ? i : (6 - i);
            do {
                System.out.print("$");
                j--;
            } while (j > 0);
            System.out.println();
            i--;
        } while (i > 0);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("\tDec  Hex");
        for (char ch = 1; ch < '0'; ch += 2) {
            System.out.printf("\t %2d   %c\n", (int) ch, ch);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch % 2 == 0) {
                System.out.printf("\t%3d   %c\n", (int) ch, ch);
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n8. Проверка, является ли число палиндромом");
        X = 1234321;
        // Получить число в обратном порядке
        Y = CyclesTheme.reverseInt(X);
        if (X == Y) {
            System.out.println("\tчисло " + X + " является палиндромом");
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n9. Определение, является ли число счастливым");
        X = 123402;
        a = CyclesTheme.summ3chifr(X);
        System.out.println("\tСумма цифр " + (X % 1000) + " = " + a);
        Y = X / 1000;
        b = CyclesTheme.summ3chifr(Y);
        System.out.println("\tСумма цифр " + (Y % 1000) + " = " + b);
        if (a == b) {
            System.out.println("\tЧисло является счастливым");
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("    ТАБЛИЦА УМНОЖЕНИЯ");
        System.out.println("   \u2502  2   3   4   5   6   7   8   9");
        System.out.print("\u2500\u2500\u2500\u253C");
        for (i = 0; i < 31; i++) {
            System.out.print("\u2500");
        }
        for (a = 2; a <= 9; a++) {
            System.out.print("\n " + a + " \u2502");
            for (b = 2; b <= 9; b++) {
                System.out.printf("%3d ", a * b);
            }
        }
    }

    // Получить число в обратном порядке
    public static int reverseInt(int value) {
        int ret = 0;
        int mod;
        while (value > 0) {
            mod = value % 10;
            ret = ret * 10 + mod;
            value /= 10;
        }
        return ret;
    }

    // Сумма трех младших цифр
    public static int summ3chifr(int value) {
        int ret = 0;
        int mod;
        for (int i = 0; i < 3; i++) {
            mod = value % 10;
            ret += mod;
            value /= 10;
        }
        return ret;
    }
}