package application;

import chess.PecaChess;

public class UI {
	
	public static void printTabuleiro(PecaChess[][] pc) {
		for(int i = 0; i<pc.length; i++) {
			System.out.print(8-i + " ");
			for(int j = 0; j<pc.length; j++) {
				UI.printPeca(pc[i][j]);
			}
            System.out.print("\n");
		}
		System.out.println("  a b c d e f g h");
	}

	
	private static void printPeca(PecaChess p) {
		if(p == null) {
			System.out.print("-");
		}else {
			System.out.print(p);
		}
		System.out.print(" ");
	}
}
