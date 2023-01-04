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
        char varChar = 'Я';
        System.out.println("\tПоследний символ русского алфавита: " + varChar);
        float varFloat = 0.02f;
        System.out.println("\tВероятность поломки компьютера: " + varFloat);
        double varDouble = 77.665544;
        System.out.println("\tПроцент занятой памяти: " + varDouble);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float pricePen = 100.0f;
        float priceBook = 200.0f;
        float discount = 0.11f;
        float summaDiscount = (pricePen + priceBook) * discount;
        System.out.println("\tСумма скидки: " + summaDiscount);
        float summa = pricePen + priceBook - summaDiscount;
        System.out.println("\tСумма покупки: " + summa);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        System.out.println("\tbyte");
        byte v1 = 127;
        System.out.println("\t\tНачальное значение: " + v1);
        v1++;
        System.out.println("\t\tЗначение после инкремента: " + v1);
        v1--;
        System.out.println("\t\tЗначение после декремента: " + v1);
        System.out.println("\tshort");
        short v2 = 32767;
        System.out.println("\t\tНачальное значение: " + v2);
        v2++;
        System.out.println("\t\tЗначение после инкремента: " + v2);
        v2--;
        System.out.println("\t\tЗначение после декремента: " + v2);
        System.out.println("\tint");
        int v3 = 2147483647;
        System.out.println("\t\tНачальное значение: " + v3);
        v3++;
        System.out.println("\t\tЗначение после инкремента: " + v3);
        v3--;
        System.out.println("\t\tЗначение после декремента: " + v3);
        System.out.println("\tlong");
        long v4 = 9223372036854775807l;
        System.out.println("\t\tНачальное значение: " + v4);
        v4++;
        System.out.println("\t\tЗначение после инкремента: " + v4);
        v4--;
        System.out.println("\t\tЗначение после декремента: " + v4);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("\tОбмен с помощью третьей переменной");
        System.out.println("\t\tНачальные значения: " + a + ", " + b);
        int t;
        t = a;
        a = b;
        b = t;
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
        char ch1 = '#'; // 35
        System.out.println("\t" + (int) ch1 + " => " + ch1);
        char ch2 = '&'; // 38
        System.out.println("\t" + (int) ch2 + " => " + ch2);
        char ch3 = '@'; // 64
        System.out.println("\t" + (int) ch3 + " => " + ch3);
        char ch4 = '^'; // 94
        System.out.println("\t" + (int) ch4 + " => " + ch4);
        char ch5 = '_'; // 95
        System.out.println("\t" + (int) ch5 + " => " + ch5);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char chLeft = '/';
        char chRight = '\\';
        char chUnderlining = '_';
        char chBracket1 = '(';
        char chBracket2 = ')';
        System.out.println("\t    " + chLeft + chRight);
        System.out.println("\t   " + chLeft + "  " + chRight);
        System.out.println("\t  " + chLeft + chUnderlining + chBracket1 + " " + chBracket2 + chRight);
        System.out.println("\t " + chLeft + "      " + chRight);
        System.out.println("\t" + chLeft + chUnderlining + chUnderlining + chUnderlining + chUnderlining + chLeft
                + chRight + chUnderlining + chUnderlining + chRight);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int N = 123;
        int X, Y, Z;
        X = N / 100;
        Y = (N - X * 100) / 10;
        Z = N % 10;
        System.out.println("\tЧисло " + N + " содержит");
        System.out.println("\t\t" + X + " сотен");
        System.out.println("\t\t" + Y + " десятков");
        System.out.println("\t\t" + Z + " единиц");
        System.out.println("\tСумма его цифр = " + (X + Y + Z));
        System.out.println("\tПроизведение его цифр = " + (X * Y * Z));
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n9. Вывод времени");
        int time = 86399;
        int hh = time / 3600;
        int mm = (time % 3600) / 60;
        int ss = time % 60;
        System.out.println("\t" + hh + ":" + mm + ":" + ss);
    }
}