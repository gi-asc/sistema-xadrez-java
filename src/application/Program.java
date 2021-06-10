package application;

import chess.PartidaChess;

public class Program {

	public static void main(String[] args) {
		PartidaChess partida = new PartidaChess();
		UI.printTabuleiro(partida.getPecas());
	}
	
}
