public class IfElseStatementTheme {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 21;
        boolean hasMale = true;
        float growth = 1.85f;
        String name = "Валера";
        //
        if (age > 20) {
            System.out.println("\tВозраст больше 20");
        } else {
            System.out.println("\tВозраст меньше-равно 20");
        }

        if (!hasMale) {
            System.out.println("\tпол: женщина");
        } else {
            System.out.println("\tпол: мужчина");
        }

        if (growth < 1.80) {
            System.out.println("\tРост меньше 1.80");
        } else {
            System.out.println("\tРост больше-равен 1.80");
        }

        char firstCh = name.charAt(0);
        if (firstCh == 'M') {
            System.out.println("\tПервая буква M");
        } else if (firstCh == 'I') {
            System.out.println("\tПервая буква I");
        } else {
            System.out.println("\tПервая буква не M и не I");
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n2. Поиск max и min числа");
        int iVal1 = 12;
        int iVal2 = 17;
        if (iVal1 < iVal2) {
            System.out.println("\tМинимальное число=" + iVal1 + ", максимальное число=" + iVal2);
        } else if (iVal2 < iVal1) {
            System.out.println("\tМинимальное число=" + iVal2 + ", максимальное число=" + iVal1);
        } else {
            System.out.println("\tЧисла одинаковые и равны " + iVal1);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n3. Проверка числа");
        int iVal = 0;
        System.out.println("\tЧисло = " + iVal);
        if (iVal != 0) {
            if (iVal % 2 == 0) {
                System.out.println("\tЧисло четное");
            } else {
                System.out.println("\tЧисло нечетное");
            }
            if (iVal < 0) {
                System.out.println("\tЧисло отрицательное");
            } else {
                System.out.println("\tЧисло положительное");
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int iNum1 = 123;
        int iNum2 = 321;
        int countEquals = 0;
        System.out.println("\tИсходные числа: " + iNum1 + ", " + iNum2);
        //
        if ((iNum1 % 10) == (iNum2 % 10)) {
            System.out.println("\tРавные цифры в разряде 0 = " + (iNum1 % 10));
            countEquals++;
        }
        iNum1 /= 10;
        iNum2 /= 10;
        //
        if ((iNum1 % 10) == (iNum2 % 10)) {
            System.out.println("\tРавные цифры в разряде 1 = " + (iNum1 % 10));
            countEquals++;
        }
        iNum1 /= 10;
        iNum2 /= 10;
        //
        if ((iNum1 % 10) == (iNum2 % 10)) {
            System.out.println("\tРавные цифры в разряде 2 = " + (iNum1 % 10));
            countEquals++;
        }
        //
        if (countEquals == 0) {
            System.out.println("\tВ числах нет одинаковых цифр");
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n5. Определение символа по его коду");
        char ch = '\u0057';
        System.out.println("\tсимвол = " + ch);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("\tмаленькая буква");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("\tбольшая буква");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("\tчисло");
        } else {
            System.out.println("\tне буква и не число");
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        float summa = 300000.00f;
        float proc;
        if (summa < 100000.00f) {
            proc = 5.0f;
        } else if (summa < 300000.00f) {
            proc = 7.0f;
        } else {
            proc = 10.0f;
        }
        float summaProc = summa * proc / 100.0f;
        System.out.println("\tСумма вклада = " + summa);
        System.out.println("\tНачисленный % = " + summaProc);
        System.out.println("\tИтоговая сумма % = " + (summa + summaProc));
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n7. Определение оценки по предметам");
        int ocHistory = 59;
        int ocProg = 91;
        System.out.println("\t" + IfElseStatementTheme.ocenka(ocHistory) + " история");
        System.out.println("\t" + IfElseStatementTheme.ocenka(ocProg) + " программирование");
        //
        float srednOcenka = (((float) IfElseStatementTheme.ocenka(ocHistory)) +
                ((float) IfElseStatementTheme.ocenka(ocProg))) / 2.0f;
        System.out.println("\tСредняя оценка: " + srednOcenka);
        //
        float srednBal = (((float) ocHistory) +
                ((float) ocProg)) / 2.0f;
        System.out.println("\tСредний балл: " + srednBal);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n8. Расчет прибыли за год");
        int arenda = 5000;
        int sebest = 9000;
        int prod = 13000;
        // Доход за год
        int dohod = (prod - sebest - arenda) * 12;
        char chPrefix;
        if (dohod < 0) {
            dohod = -dohod;
            chPrefix = '-';
        } else {
            chPrefix = '+';
        }
        System.out.println("\tприбыль за год: " + chPrefix + dohod + " руб");
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n9. Подсчет количества банкнот");
        int iSumma = 567;
        System.out.println("\tСумма = " + iSumma);
        int iBanknota100 = 10;
        int iBanknota10 = 5;
        int iBanknota1 = 50;
        // Количество банкнот 100
        int count100 = iSumma / 100;
        if (count100 > iBanknota100) {
            count100 = iBanknota100;
        }
        iSumma -= 100 * count100;
        // Количество банкнот 10
        int count10 = iSumma / 10;
        if (count10 > iBanknota10) {
            count10 = iBanknota10;
        }
        iSumma -= 10 * count10;
        // Количество банкнот 1
        int count1 = iSumma;
        if (count1 > iBanknota1) {
            count1 = iBanknota1;
        }
        // Требуемое количество банкнот
        System.out.println("\t100: " + count100);
        System.out.println("\t10: " + count10);
        System.out.println("\t1: " + count1);
        System.out.println("\tВыдаваемая сумма: " + (count100 * 100 + count10 * 10 + count1));
    }

    // Определить оценку по успеваемости
    public static int ocenka(int ocenka) {
        int ret;
        if (ocenka < 60) {
            ret = 2;
        } else if (ocenka < 73) {
            ret = 3;
        } else if (ocenka < 91) {
            ret = 4;
        } else {
            ret = 5;
        }
        return ret;
    }
}