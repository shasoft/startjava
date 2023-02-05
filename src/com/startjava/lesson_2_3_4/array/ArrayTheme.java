package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = { 1, 2, 3, 4, 5, 6, 7 };
        printArrayInt("Начальное значение", intArr);
        int len = intArr.length - 1;
        for (int i = 0; i < len; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[len];
            intArr[len] = temp;
            len--;
        }
        printArrayInt("После перестановки", intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        System.out.print("\t");
        intArr = new int[10];
        len = intArr.length;
        for (int i = 0; i < len; i++)
            intArr[i] = i;
        int productDigits = 1;
        for (int i = 1; i < len - 1; i++) {
            productDigits *= intArr[i];
            System.out.print(intArr[i] + " " + (i < len - 1 ? "*" : "=") + " ");
        }
        System.out.println(productDigits);
        System.out.println("\tЭлемент массив 0 = " + intArr[0]);
        System.out.println("\tЭлемент массив 9 = " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatArr = new float[15];
        len = floatArr.length;
        for (int i = 0; i < len; i++) {
            floatArr[i] = (float) Math.random();
        }
        printArrayFloat("Исходный массив", floatArr, 8);
        float middleNumber = floatArr[len / 2];
        System.out.printf("\tСреднее значение %.3f\n", middleNumber);
        int countZero = 0;
        for (int i = 0; i < len; i++) {
            if (middleNumber < floatArr[i]) {
                floatArr[i] = 0;
                countZero++;
            }
        }
        printArrayFloat("Измененный массив", floatArr, 8);
        System.out.println("\tколичество обнуленных ячеек " + countZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] englishAlphabet = new char['Z' - 'A' + 1];
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            englishAlphabet[ch - 'A'] = ch;
        }
        len = englishAlphabet.length;
        for (int row = 0; row < len; row++) {
            System.out.print("\t");
            for (int col = 0; col <= row; col++) {
                System.out.print(englishAlphabet[len - 1 - col]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNumbers = new int[30];
        int countNumbers = 0;
        len = uniqueNumbers.length;
        while (countNumbers < len) {
            int randomNumber = (int) (Math.random() * 40 + 60);
            boolean unique = true;
            for (int i = 0; i < countNumbers; i++) {
                if (randomNumber == uniqueNumbers[i]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                uniqueNumbers[countNumbers] = randomNumber;
                countNumbers++;
            }
        }
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (uniqueNumbers[i] > uniqueNumbers[j]) {
                    int temp = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[j];
                    uniqueNumbers[j] = temp;
                }

            }
        }
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0) {
                if (i != 0)
                    System.out.println();
                System.out.print("\t");
            }
            System.out.printf("%4d", uniqueNumbers[i]);
        }
        System.out.println();

        System.out.println("\n6. Сдвиг элементов массива");
        String[] srcArray = { "    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", "" };
        System.out.println("\tИсходный массив: " + Arrays.toString(srcArray));
        len = 0;
        for (String str : srcArray) {
            if (!str.isBlank()) {
                len++;
            }
        }
        String[] destArray = new String[len];
        int destPos = 0;
        int copyLength = 0;
        len = srcArray.length;
        for (int i = 0; i < len; i++) {
            if (srcArray[i].isBlank()) {
                if (copyLength > 0) {
                    System.arraycopy(srcArray, i - copyLength, destArray, destPos, copyLength);
                    destPos += copyLength;
                    copyLength = 0;
                }
            } else {
                copyLength++;
            }
        }
        System.out.println("\t      Результат: " + Arrays.toString(destArray));
    }

    public static void printArrayInt(String title, int[] numbers) {
        System.out.print("\t" + title + ":");
        for (int val : numbers) {
            System.out.print(" " + val);
        }
        System.out.println();
    }

    public static void printArrayFloat(String title, float[] numbers, int maxColumns) {
        System.out.print("\t" + title);
        int column = 0;
        for (float val : numbers) {
            if (column == maxColumns) {
                column = 0;
            }
            if (column == 0) {
                System.out.println();
                System.out.print("\t\t");
            }
            System.out.printf(" %.3f", val);
            column++;
        }
        System.out.println();
    }
}