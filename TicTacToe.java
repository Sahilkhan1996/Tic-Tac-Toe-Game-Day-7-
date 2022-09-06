package com.brideglabz.tictactoe;

public class TicTacToe {
	
	static char[] board = new char[10];
	
	static void createBoard(){
		for(int index = 0 ; index<10 ; index++) {
			board[index] = ' ';
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("----- Welcome To The Game Of Tic Tac Toe -----");
		createBoard();
		

	}

}