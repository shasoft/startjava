public class GuessNumber {
    public static void main(String[] args) {
        int numberComputer = 10;
        int numberHuman = 50;

        while (numberHuman != numberComputer) {
            if (numberHuman > numberComputer) {
                System.out.println("Число " + numberHuman + " больше того, что загадал компьютер");
                numberHuman--;
            } else {
                System.out.println("Число " + numberHuman + " меньше того, что загадал компьютер");
                numberHuman++;
            }
        }

        System.out.println("Вы победили!");
    }
}