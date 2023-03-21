package ticTacToe;

import java.util.Scanner;

/* Tic Tac Toe 
 * without using multidimensional arrays
 * or functions */

public class TicTacToe {
	
	final static String PLAYER_1 = "X";
	final static String PLAYER_2 = "O";
	
	public static void main(String[] args) {
				
		String[] row1 = {"1", "2", "3"};
		String[] row2 = {"4", "5", "6"};
		String[] row3 = {"7", "8", "9"};
		
		Scanner sc = new Scanner(System.in); 
		String playerTurn = PLAYER_1; // X or O based on turn
		int turns = 1; //Total of 9 turns
		boolean noWinner = true;
		
		while (turns < 9 || noWinner) {
			
			if (turns != 1) {
				for (int i = 0; i < 20; i++) {
					System.out.print("\n");
				}
			}
			
			System.out.println("========================");
			System.out.println("|| A Tic Tac Toe game ||");
			System.out.println("========================\n");
			
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
			System.out.println("\n");
			
			System.out.println(playerTurn + ", please write your desired position (1-9)");
			System.out.print("Input # here: ");
			int playerInput = sc.nextInt();
			
			while (playerInput < 1 || 9 < playerInput) {
				System.out.println("\nInvalid input");
				System.out.print("Please enter a new one: ");
				playerInput = sc.nextInt();
			}	
			
			if (playerInput == 1 && row1[0] == "1") {
				row1[0] = playerTurn;
			} else if (playerInput == 2 && row1[1] == "2") {
				row1[1] = playerTurn;
			} else if (playerInput == 3 && row1[2] == "3") {
				row1[2] = playerTurn;
			} else if (playerInput == 4 && row2[0] == "4") {
				row2[0] = playerTurn;
			} else if (playerInput == 5 && row2[1] == "5") {
				row2[1] = playerTurn;
			} else if (playerInput == 6 && row2[2] == "6") {
				row2[2] = playerTurn;
			} else if (playerInput == 7 && row3[0] == "7") {
				row3[0] = playerTurn;
			} else if (playerInput == 8 && row3[1] == "8") {
				row3[1] = playerTurn;
			} else if (playerInput == 9 && row3[2] == "9") {
				row3[2] = playerTurn;
			}
			
			turns += 1;
		}
	}
}
