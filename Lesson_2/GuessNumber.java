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

    public Player activePlayer() {
        Player player;
        if (playerIndex == 0) {
            player = player1;
            playerIndex = 1;
        } else {
            player = player2;
            playerIndex = 0;
        }
        return player;
    }

    public void thinkNumber() {
        secretNumber = (int) (Math.random() * 100.0f);
    }

    public boolean hasEqual(int number) {
        return number == secretNumber;
    }

    public boolean less(int number) {
        return number < secretNumber;
    }
}