package chess;

import tabuleiro.Board;

public class PartidaChess {

	private Board board;
	
	public PartidaChess() {
		this.board = new Board(8, 8);
	}
	
	public PecaChess[][] getPecas(){
		PecaChess[][] partidaPecas = new PecaChess[board.getLinhas()][board.getColunas()];
		for(int i = 0; i<board.getLinhas(); i++) {
			for(int j = 0; j<board.getColunas(); j++) {
				partidaPecas[i][j] = (PecaChess) board.peca(i, j);
			}
		}
		return partidaPecas;
	}
}
