public class TicTacToe {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player('X');
        Player player2 = new Player('O');
        Player currentPlayer = player1;

        while (true) {
            board.display();
            int[] move = currentPlayer.makeMove(board);
            board.updateBoard(move[0], move[1], currentPlayer.getSymbol());

            if (board.checkWin(currentPlayer.getSymbol())) {
                board.display();
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                break;
            }

            if (board.isBoardFull()) {
                board.display();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}

