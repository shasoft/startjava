import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private int playerIndex;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        playerIndex = 0;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner console = new Scanner(System.in);
        secretNumber = (int) (Math.random() * 100.0f);
        while (true) {
            Player activePlayer;
            if (playerIndex == 0) {
                activePlayer = player1;
                playerIndex = 1;
            } else {
                activePlayer = player2;
                playerIndex = 0;
            }
            System.out.print("Игрок " + activePlayer + " укажите число: ");
            int number = console.nextInt();
            activePlayer.setNumber(number);
            if (number == secretNumber) {
                System.out.println("Игрок " + activePlayer + " одержал победу");
                break;
            } else {
                if (number < secretNumber) {
                    System.out.println("Число " + number + " меньше того, что загадал компьютер");
                } else {
                    System.out.println("Число " + number + " больше того, что загадал компьютер");
                }
            }
        }
    }

}