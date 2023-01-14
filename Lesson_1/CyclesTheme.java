public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int startRange = -10;
        int endRange = 21;
        int sumEven = 0;
        int sumOdd = 0;
        int number = startRange;
        do {
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
            // Увеличить число
            number++;
        } while (number <= endRange);
        System.out.println(
                "\tв промежутке [" + startRange + ", " + endRange + "] сумма четных чисел = " + sumEven
                        + ", а нечетных = " + sumOdd);

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
        for (int i = max - 1; i > min; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        number = 1234;
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
        for (int i = 1; i < 24; i += 2) {
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
        int countTwos = 0;
        int copyNumber = number;
        while (copyNumber > 0) {
            int digit = copyNumber % 10;
            if (digit == 2) {
                countTwos++;
            }
            copyNumber /= 10;
        }
        System.out.println("\tчисло " + number + " содержит " +
                countTwos + " (" + ((countTwos % 2) == 0 ? "четное" : "нечетное") + ") количество двоек");

        System.out.println("\n6. Отображение фигур в консоли");

        // Прямоугольник
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Треугольник
        int row = 5;
        while (row >= 0) {
            int col = row;
            while (col >= 0) {
                System.out.print("#");
                col--;
            }
            row--;
            System.out.println();
        }
        System.out.println();

        // Треугольник 2
        row = 5;
        do {
            int col = (row <= 3) ? row : (6 - row);
            do {
                System.out.print("$");
                col--;
            } while (col > 0);
            System.out.println();
            row--;
        } while (row > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("\tDec  Hex");
        for (char ch = 1; ch < '0'; ch += 2) {
            System.out.printf("\t%3d%4c\n", (int) ch, ch);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch % 2 == 0) {
                System.out.printf("\t%3d%4c\n", (int) ch, ch);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        // Получить число в обратном порядке
        int reverseNumber = 0;
        copyNumber = number;
        while (copyNumber > 0) {
            int digit = copyNumber % 10;
            reverseNumber = reverseNumber * 10 + digit;
            copyNumber /= 10;
        }

        if (number == reverseNumber) {
            System.out.println("\tчисло " + number + " является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        number = 402123;
        int digitsRight = 0;
        int sumDigitsRight = 0;
        int digitsLeft = 0;
        int sumDigitsLeft = 0;
        int mul = 1;
        for (int i = 0; i < 6; i++) {
            int digit = number % 10;
            if (i < 3) {
                sumDigitsRight += digit;
                digitsRight = digit * mul + digitsRight;
            } else {
                if (i == 3) {
                    mul = 1;
                }
                sumDigitsLeft += digit;
                digitsLeft = digit * mul + digitsLeft;
            }
            number /= 10;
            mul *= 10;
        }
        System.out.println("\tСумма цифр " + digitsRight + " = " + sumDigitsRight);
        System.out.println("\tСумма цифр " + digitsLeft + " = " + sumDigitsLeft);
        if (sumDigitsRight == sumDigitsLeft) {
            System.out.println("\tЧисло является счастливым");
        } else {
            System.out.println("\tЧисло не является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("    ТАБЛИЦА УМНОЖЕНИЯ");
        System.out.println("   │  2   3   4   5   6   7   8   9");
        System.out.print("───┼───────────────────────────────");
        for (a = 2; a <= 9; a++) {
            System.out.print("\n " + a + " │");
            for (b = 2; b <= 9; b++) {
                System.out.printf("%3d ", a * b);
            }
        }
    }
}