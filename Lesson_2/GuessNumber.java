import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner console = new Scanner(System.in);
        secretNumber = (int) (Math.random() * 101.0f);
        Player activePlayer = player2;
        while (true) {
            activePlayer = activePlayer.equals(player1) ? player2 : player1;
            System.out.print("Игрок " + activePlayer + " введите число: ");
            int number = console.nextInt();
            activePlayer.setNumber(number);
            if (number == secretNumber) {
                System.out.println("Игрок " + activePlayer + " одержал победу");
                break;
            }
            if (number < secretNumber) {
                System.out.println("Число " + number + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Число " + number + " больше того, что загадал компьютер");
            }
        }
    }

}