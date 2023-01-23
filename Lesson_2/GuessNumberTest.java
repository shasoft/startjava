import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        GuessNumber game = new GuessNumber(createPlayer(console, 1), createPlayer(console, 2));

        String answer;
        do {
            game.thinkNumber();
            while (true) {
                Player activePlayer = game.activePlayer();
                System.out.print("Игрок " + activePlayer + " укажите число: ");
                int number = console.nextInt();
                activePlayer.setNumber(number);
                if (game.hasEqual(number)) {
                    System.out.println("Игрок " + activePlayer + " одержал победу");
                    break;
                } else {
                    if (game.less(number)) {
                        System.out.println("Число " + number + " меньше того, что загадал компьютер");
                    } else {
                        System.out.println("Число " + number + " больше того, что загадал компьютер");
                    }
                }
            }
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = console.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));

    }

    public static Player createPlayer(Scanner console, int playerNumber) {
        System.out.print("Введите имя игрока " + playerNumber + ": ");
        return new Player(console.nextLine());
    }
}