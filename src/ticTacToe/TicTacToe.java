package ticTacToe;

/* Tic Tac Toe 
 * without using multidimensional arrays
 * or functions */

public class TicTacToe {
	
	final String PLAYER_1 = "O";
	final String PLAYER_2 = "X";
	
	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("|| A Tic Tac Toe game ||");
		System.out.println("========================\n\n");
		
		boolean noWinner = true;
		
		String[] row1 = {"1", "2", "3"};
		String[] row2 = {"4", "5", "6"};
		String[] row3 = {"7", "8", "9"};
		
		for (int i = 0; i < row1.length; i++) {
			System.out.print(row1[i]);
			if (i == 0 || i == 1) {
				System.out.print("|");
			}
		}
		System.out.println("\n-----");
		
		for (int i = 0; i < row2.length; i++) {
			System.out.print(row2[i]);
			if (i == 0 || i == 1) {
				System.out.print("|");
			}
		}
		System.out.println("\n-----");
		
		for (int i = 0; i < row3.length; i++) {
			System.out.print(row3[i]);
			if (i == 0 || i == 1) {
				System.out.print("|");
			}
		}
	}

}
