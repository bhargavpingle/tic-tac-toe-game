import java.util.Scanner;

public class Player {
    private char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public int[] makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.println("Player " + symbol + ", enter your move (row [0-2] and column [0-2]): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board.isPositionEmpty(row, col)) {
                break;
            } else {
                System.out.println("Invalid move! Please try again.");
            }
        }

        return new int[]{row, col};
    }
}
