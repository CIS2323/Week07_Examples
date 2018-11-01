package Chess;

public class Board {
	private Piece[][] board = new Piece[8][8];

	public void set(Piece p, int x, int y){
		board[x][y] = p;
	}

	public boolean check(int x, int y){
		return (board[x][y] != null);
	}
}
