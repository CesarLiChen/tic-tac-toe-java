package ticTacToe;

import java.util.Scanner;

/* Tic Tac Toe 
 * without using multidimensional arrays
 * or functions */

public class TicTacToe {
	
	final static String PLAYER_1 = "X";
	final static String PLAYER_2 = "O";
	
	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("|| A Tic Tac Toe game ||");
		System.out.println("========================\n\n");
		
		
		String[] row1 = {"1", "2", "3"};
		String[] row2 = {"4", "5", "6"};
		String[] row3 = {"7", "8", "9"};
		
		Scanner sc = new Scanner(System.in); 
		String playerTurn = PLAYER_1; // X or O based on turn
		int turns = 1; //Total of 9 turns
		boolean noWinner = true;
		
		System.out.println("X goes first\n");
		while (turns < 9 || noWinner) {
			
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
			System.out.println("\n\n");
			
			System.out.println(playerTurn + ", please write your desired position (1-9)");
			System.out.print("Input # here: ");
			int playerInput = sc.nextInt();
		}
	}

}
