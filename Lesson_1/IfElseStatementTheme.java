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
        char firstChar = name.charAt(0);
        if (firstChar == 'M') {
            System.out.println("\tПервая буква M");
        } else if (firstChar == 'I') {
            System.out.println("\tПервая буква I");
        } else {
            System.out.println("\tПервая буква не M и не I");
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n2. Поиск max и min числа");
        int intVar1 = 12;
        int intVar2 = 17;
        if (intVar1 < intVar2) {
            System.out.println("\tМинимальное число=" + intVar1 + ", максимальное число=" + intVar2);
        } else if (intVar2 < intVar1) {
            System.out.println("\tМинимальное число=" + intVar2 + ", максимальное число=" + intVar1);
        } else {
            System.out.println("\tЧисла одинаковые и равны " + intVar1);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n3. Проверка числа");
        int intVar = 0;
        System.out.println("\tЧисло = " + intVar);
        if (intVar != 0) {
            if (intVar % 2 == 0) {
                System.out.println("\tЧисло четное");
            } else {
                System.out.println("\tЧисло нечетное");
            }
            if (intVar < 0) {
                System.out.println("\tЧисло отрицательное");
            } else {
                System.out.println("\tЧисло положительное");
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 321;
        int countEquals = 0;
        System.out.println("\tИсходные числа: " + number1 + ", " + number2);
        //
        if ((number1 % 10) == (number2 % 10)) {
            System.out.println("\tРавные цифры в разряде 0 = " + (number1 % 10));
            countEquals++;
        }
        number1 /= 10;
        number2 /= 10;
        //
        if ((number1 % 10) == (number2 % 10)) {
            System.out.println("\tРавные цифры в разряде 1 = " + (number1 % 10));
            countEquals++;
        }
        number1 /= 10;
        number2 /= 10;
        //
        if ((number1 % 10) == (number2 % 10)) {
            System.out.println("\tРавные цифры в разряде 2 = " + (number1 % 10));
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
        float sum = 300000.00f;
        float percent;
        if (sum < 100000.00f) {
            percent = 5.0f;
        } else if (sum < 300000.00f) {
            percent = 7.0f;
        } else {
            percent = 10.0f;
        }
        float sumPercent = sum * percent / 100.0f;
        System.out.println("\tСумма вклада = " + sum);
        System.out.println("\tНачисленный % = " + sumPercent);
        System.out.println("\tИтоговая сумма % = " + (sum + sumPercent));
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProgramming = 91;
        System.out.println("\t" + IfElseStatementTheme.rating(percentHistory) + " история");
        System.out.println("\t" + IfElseStatementTheme.rating(percentProgramming) + " программирование");
        //
        float average = (((float) IfElseStatementTheme.rating(percentHistory)) +
                ((float) IfElseStatementTheme.rating(percentProgramming))) / 2.0f;
        System.out.println("\tСредняя оценка: " + average);
        //
        float averagePercent = (((float) percentHistory) +
                ((float) percentProgramming)) / 2.0f;
        System.out.println("\tСредний балл: " + averagePercent);
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int cost = 9000;
        int sale = 13000;
        // Доход за год
        int income = (sale - cost - rent) * 12;
        char sign;
        if (income < 0) {
            income = -income;
            sign = '-';
        } else {
            sign = '+';
        }
        System.out.println("\tприбыль за год: " + sign + income + " руб");
        /////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n9. Подсчет количества банкнот");
        int intSum = 567;
        System.out.println("\tСумма = " + intSum);
        int banknote100 = 10;
        int banknote10 = 5;
        int banknote1 = 50;
        // Количество банкнот 100
        int count100 = intSum / 100;
        if (count100 > banknote100) {
            count100 = banknote100;
        }
        intSum -= 100 * count100;
        // Количество банкнот 10
        int count10 = intSum / 10;
        if (count10 > banknote10) {
            count10 = banknote10;
        }
        intSum -= 10 * count10;
        // Количество банкнот 1
        int count1 = intSum;
        if (count1 > banknote1) {
            count1 = banknote1;
        }
        // Требуемое количество банкнот
        System.out.println("\t100: " + count100);
        System.out.println("\t10: " + count10);
        System.out.println("\t1: " + count1);
        System.out.println("\tВыдаваемая сумма: " + (count100 * 100 + count10 * 10 + count1));
    }

    // Определить оценку по успеваемости
    public static int rating(int percent) {
        int ret;
        if (percent < 60) {
            ret = 2;
        } else if (percent < 73) {
            ret = 3;
        } else if (percent < 91) {
            ret = 4;
        } else {
            ret = 5;
        }
        return ret;
    }
}