import java.util.Random;

public class Board {
	
	private String[][] Board;

	public Board(String[][] board) {
		Random rand = new Random();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.toString(rand.nextInt(-5) + 5);
			}
		}
	}

	public void displayBoard(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.println(board[i][j]);
			}
		}
	}

	public void replaceSquare() {

	}

}
