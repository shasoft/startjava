package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Реверс значений массива");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7};
        printArrayInt("Начальное значение", intArr);
        for (int i = 0; i < intArr.length / 2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[intArr.length - 1 - i];
            intArr[intArr.length - 1 - i] = temp;
        }
        printArrayInt("После перестановки", intArr);

        System.out.println("\n2. Вывод произведения элементов массива");
        System.out.print("\t");
        intArr = new int[10];
        for (int i = 0; i < intArr.length; i++)
            intArr[i] = i;
        int digits = 1;
        int countOut = 0;
        for (int i = 0; i < intArr.length; i++) {
            boolean isMul = intArr[i] > 0 && intArr[i] < 9;
            digits *= isMul ? intArr[i] : 1;
            countOut += isMul ? 1 : 0;
            System.out.print(isMul ? (intArr[i] + (isMul ? (" " + (countOut < 8 ? "*" : "=") + " ") : "")) : "");
        }
        System.out.println(digits);
        System.out.println("\tЭлемент массив 0 = " + intArr[0]);
        System.out.println("\tЭлемент массив 9 = " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        float[] floatArr = new float[15];
        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = (float) Math.random();
        }
        printArrayFloat("Исходный массив", floatArr, 8);
        float middleNumber = floatArr[floatArr.length / 2];
        System.out.printf("\tСреднее значение %.3f\n", middleNumber);
        int countZero = 0;
        for (int i = 0; i < floatArr.length; i++) {
            if (middleNumber < floatArr[i]) {
                floatArr[i] = 0;
                countZero++;
            }
        }
        printArrayFloat("Измененный массив", floatArr, 8);
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
        int[] intArrRandom = new int[41];
        for (int i = 0; i < intArrRandom.length; i++) {
            intArrRandom[i] = 60 + i;
        }
        intArr = new int[30];
        int countRandom = intArrRandom.length;
        for (int i = 0; i < intArr.length; i++) {
            int indexRandom = (int) (Math.random() * (float) countRandom);
            intArr[i] = intArrRandom[indexRandom];
            intArrRandom[indexRandom] = intArrRandom[countRandom - 1];
            countRandom--;
        }
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }

            }
        }
        for (int i = 0; i < intArr.length; i++) {
            if (i % 10 == 0) {
                if (i != 0)
                    System.out.println();
                System.out.print("\t");
            }
            System.out.printf("%4d", intArr[i]);
        }
        System.out.println();

        System.out.println("\n6. Сдвиг элементов массива");
        String[] strings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
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