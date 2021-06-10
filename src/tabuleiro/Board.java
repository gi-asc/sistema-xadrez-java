package tabuleiro;

public class Board {

	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Board(int linhas, int colunas) {
		this.setLinhas(linhas);
		this.setColunas(colunas);
		this.pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	public Peca peca(Position p) {
		return pecas[p.getLinha()][p.getColuna()];
	}
	
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
}
