package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n1. Вывод значений переменных на консоль");
        boolean hasProcessor = true;
        System.out.println("\tЕсть процессор?: " + hasProcessor);
        byte countMonitors = 1;
        System.out.println("\tКоличество мониторов: " + countMonitors);
        short sizeMemory = 8;
        System.out.println("\tКоличество Мб памяти: " + sizeMemory);
        int countCore = 4;
        System.out.println("\tКоличество ядер: " + countCore);
        long weightComputer = 11234;
        System.out.println("\tВес компьютера, грамм: " + weightComputer);
        char lastCharRussianAlphabet = 'Я';
        System.out.println("\tПоследний символ русского алфавита на клавиатуре: " + lastCharRussianAlphabet);
        float probabilityOfBreakage = 0.02f;
        System.out.println("\tВероятность поломки компьютера: " + probabilityOfBreakage);
        double usedMemory = 77.665544;
        System.out.println("\tПроцент занятой памяти: " + usedMemory);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float pricePen = 100.0f;
        float priceBook = 200.0f;
        float discount = 0.11f;
        float discountSum = (pricePen + priceBook) * discount;
        System.out.println("\tСумма скидки: " + discountSum);
        float discountPrice = pricePen + priceBook - discountSum;
        System.out.println("\tСумма покупки: " + discountPrice);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        System.out.println("\tbyte");
        byte byteVar = 127;
        System.out.println("\t\tНачальное значение: " + byteVar);
        System.out.println("\t\tЗначение после инкремента: " + (++byteVar));
        System.out.println("\t\tЗначение после декремента: " + (--byteVar));
        System.out.println("\tshort");
        short shortVar = 32767;
        System.out.println("\t\tНачальное значение: " + shortVar);
        System.out.println("\t\tЗначение после инкремента: " + (++shortVar));
        System.out.println("\t\tЗначение после декремента: " + (--shortVar));
        System.out.println("\tint");
        int intVar = 2147483647;
        System.out.println("\t\tНачальное значение: " + intVar);
        System.out.println("\t\tЗначение после инкремента: " + (++intVar));
        System.out.println("\t\tЗначение после декремента: " + (--intVar));
        System.out.println("\tlong");
        long longVar = 9223372036854775807l;
        System.out.println("\t\tНачальное значение: " + longVar);
        System.out.println("\t\tЗначение после инкремента: " + (++longVar));
        System.out.println("\t\tЗначение после декремента: " + (--longVar));
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("\tОбмен с помощью третьей переменной");
        System.out.println("\t\tНачальные значения: " + a + ", " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("\t\tКонечные значения: " + a + ", " + b);
        System.out.println("\tОбмен с помощью арифметических операций");
        System.out.println("\t\tНачальные значения: " + a + ", " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("\t\tКонечные значения: " + a + ", " + b);
        System.out.println("\tОбмен с помощью побитовой операции ^");
        System.out.println("\t\tНачальные значения: " + a + ", " + b);
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.println("\t\tКонечные значения: " + a + ", " + b);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n6. Вывод символов и их кодов");
        char numberSign = '#'; // 35
        System.out.println("\t" + (int) numberSign + " => " + numberSign);
        char ampersand = '&'; // 38
        System.out.println("\t" + (int) ampersand + " => " + ampersand);
        char commercialAt = '@'; // 64
        System.out.println("\t" + (int) commercialAt + " => " + commercialAt);
        char xor = '^'; // 94
        System.out.println("\t" + (int) xor + " => " + xor);
        char lowLine = '_'; // 95
        System.out.println("\t" + (int) lowLine + " => " + lowLine);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("\t    " + slash + backslash);
        System.out.println("\t   " + slash + "  " + backslash);
        System.out.println("\t  " + slash + lowLine + leftParenthesis + " " + rightParenthesis + backslash);
        System.out.println("\t " + slash + "      " + backslash);
        System.out.println("\t" + slash + lowLine + lowLine + lowLine + lowLine + slash
                + backslash + lowLine + lowLine + backslash);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = (srcNum % 100) / 10;
        int ones = srcNum % 10;
        System.out.println("\tЧисло " + srcNum + " содержит");
        System.out.println("\t\t" + hundreds + " сотен");
        System.out.println("\t\t" + tens + " десятков");
        System.out.println("\t\t" + ones + " единиц");
        System.out.println("\tСумма его цифр = " + (hundreds + tens + ones));
        System.out.println("\tПроизведение его цифр = " + (hundreds * tens * ones));
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n9. Вывод времени");
        int time = 86399;
        int hh = time / 3600;
        int mm = (time % 3600) / 60;
        int ss = time % 60;
        System.out.println("\t" + hh + ":" + mm + ":" + ss);
    }
}