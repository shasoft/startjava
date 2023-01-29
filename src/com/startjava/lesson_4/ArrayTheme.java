package com.startjava.lesson_4;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] arrInts = { 1, 2, 3, 4, 5, 6, 7 };
        printArrayInt("Начальное значение", arrInts);
        for (int i = 0; i < arrInts.length / 2; i++) {
            int swapInt = arrInts[i];
            arrInts[i] = arrInts[arrInts.length - 1 - i];
            arrInts[arrInts.length - 1 - i] = swapInt;
        }
        printArrayInt("После перестановки", arrInts);

        System.out.println("\n2. Вывод произведения элементов массива");
        System.out.print("\t");
        arrInts = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int productNumbers = 1;
        for (int i = 0; i < arrInts.length; i++) {
            boolean hasProduct = arrInts[i] > 0 && arrInts[i] < 9;
            String sign = hasProduct ? (" " + (arrInts[i] < 8 ? "*" : "=") + " ") : "";
            productNumbers *= hasProduct ? arrInts[i] : 1;
            System.out.print(hasProduct ? (arrInts[i] + sign) : "");
        }
        System.out.println(productNumbers);

        System.out.println("\n3. Удаление элементов массива");
        float[] arrFloats = new float[15];
        for (int i = 0; i < arrFloats.length; i++) {
            arrFloats[i] = (float) Math.random();
        }
        printArrayFloat("Исходные массив", arrFloats, 8);
        float middleFloat = arrFloats[arrFloats.length / 2];
        System.out.printf("\tСреднее значение %.3f\n", middleFloat);
        int countZero = 0;
        for (int i = 0; i < arrFloats.length; i++) {
            if (middleFloat < arrFloats[i]) {
                arrFloats[i] = 0;
                countZero++;
            }
        }
        printArrayFloat("Измененный массив", arrFloats, 8);
        System.out.println("\tколичество обнуленных ячеек " + countZero);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] arrChars = new char['Z' - 'A' + 1];
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            arrChars[ch - 'A'] = ch;
        }
        for (int row = 0; row < arrChars.length; row++) {
            System.out.print("\t");
            for (int col = 0; col <= row; col++) {
                System.out.print(arrChars[arrChars.length - 1 - col]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] arrRandomInts = new int[41];
        for (int i = 0; i < arrRandomInts.length; i++) {
            arrRandomInts[i] = 60 + i;
        }
        arrInts = new int[30];
        int countRandom = arrRandomInts.length;
        for (int i = 0; i < arrInts.length; i++) {
            int indexRandom = (int) (Math.random() * (float) countRandom);
            arrInts[i] = arrRandomInts[indexRandom];
            arrRandomInts[indexRandom] = arrRandomInts[countRandom - 1];
            countRandom--;
        }
        for (int i = 0; i < arrInts.length - 1; i++) {
            for (int j = i + 1; j < arrInts.length; j++) {
                if (arrInts[i] > arrInts[j]) {
                    int swap = arrInts[i];
                    arrInts[i] = arrInts[j];
                    arrInts[j] = swap;
                }

            }
        }
        for (int i = 0; i < arrInts.length; i++) {
            if (i % 10 == 0) {
                if (i != 0)
                    System.out.println();
                System.out.print("\t");
            }
            System.out.printf("%4d", arrInts[i]);
        }
        System.out.println();

        System.out.println("\n6. Сдвиг элементов массива");
        String[] strings = { "    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", "" };
        System.out.println("\tИсходный массив: " + Arrays.toString(strings));
        int countNotBlank = 0;
        for (String str : strings) {
            if (!str.isBlank()) {
                countNotBlank++;
            }
        }
        String[] stringsNotBlank = new String[countNotBlank];
        int destPos = 0;
        for (int srcPos = 0; srcPos < strings.length; srcPos++) {
            if (!strings[srcPos].isBlank()) {
                int copyLength = 1;
                for (int i = srcPos + 1; i < strings.length; i++) {
                    if (strings[i].isBlank())
                        break;
                    copyLength++;
                }
                System.arraycopy(strings, srcPos, stringsNotBlank, destPos, copyLength);
                destPos += copyLength;
                srcPos += (copyLength - 1);
            }
        }
        System.out.println("\t      Результат: " + Arrays.toString(stringsNotBlank));
    }

    public static void printArrayInt(String title, int[] values) {
        System.out.print("\t" + title + ":");
        for (int val : values) {
            System.out.print(" " + val);
        }
        System.out.println();
    }

    public static void printArrayFloat(String title, float[] values, int maxColumns) {
        System.out.print("\t" + title);
        int column = 0;
        for (float val : values) {
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