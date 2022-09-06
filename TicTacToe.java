package com.brideglabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	static char[] board = new char[10];
	static char player,computer;
	public static Scanner scanner = new Scanner(System.in);
	
	static void createBoard(){
		for(int index = 1 ; index<10 ; index++) {
			board[index] = ' ';
		}
	}
	
	static void getPlayerChoice() {
		 System.out.print("select X or O : ");
		 player = Character.toUpperCase(scanner.next().charAt(0));
		 
		 if (player == 'X')
			 computer='O';
		 else
			 computer ='X';
		 System.out.println("You have selected : " +player);
		 System.out.println("Computer's choice is : " +computer);
	}
	
	static void showBoard() {
        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("----- Welcome To The Game Of Tic Tac Toe -----");
		createBoard();
		getPlayerChoice();
		

	}

}