public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int even = 0;
        int odd = 0;
        int i = startRange;
        do {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
            // Увеличить число
            i++;
        } while (i <= endRange);
        System.out.println(
                "\tв промежутке [" + startRange + ", " + endRange + "] сумма четных чисел = " + even + ", а нечетных = "
                        + odd);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        // Определяем минимальное число
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        // Определяем максимальное число
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("\t Минимальное = " + min + ", Максимальное = " + max);
        System.out.print("\tВсе числа интервала (" + min + "," + max + ") в порядке убывания:");
        for (i = max - 1; i > min; i--) {
            System.out.print(" " + i);
        }
        System.out.print("\n");

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumDigits = 0;
        System.out.print("\tВ обратном порядке: ");
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sumDigits += digit;
            number /= 10;
        }
        System.out.println("\n\tСумма цифр: " + sumDigits);

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

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        number = 3242592;
        int countDigit2 = 0;
        int copyNumber = number;
        while (copyNumber > 0) {
            int digit = copyNumber % 10;
            if (digit == 2) {
                countDigit2++;
            }
            copyNumber /= 10;
        }
        System.out.println("\tчисло " + number + " содержит " +
                countDigit2 + " (" + ((countDigit2 % 2) == 0 ? "четное" : "нечетное") + ") количество двоек");

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

        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        // Получить число в обратном порядке
        int numberReverse = reverseInt(number);
        if (number == numberReverse) {
            System.out.println("\tчисло " + number + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        number = 123402;
        int sumDigitsRight = sumDigits(number);
        System.out.println("\tСумма цифр " + (number % 1000) + " = " + sumDigitsRight);
        number = number / 1000;
        int sumDigitsLeft = sumDigits(number);
        System.out.println("\tСумма цифр " + (number % 1000) + " = " + sumDigitsLeft);
        if (sumDigitsRight == sumDigitsLeft) {
            System.out.println("\tЧисло является счастливым");
        } else {
            System.out.println("\tЧисло не является счастливым");
        }

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
    public static int sumDigits(int value) {
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