package chess;

import tabuleiro.Board;
import tabuleiro.Peca;

public class PecaChess extends Peca {
    private Cor cor;
    
	public PecaChess(Board board, Cor cor) {
		super(board);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	
}
