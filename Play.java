import Chess.*;
import java.util.Scanner;

public class Play {
	public static void main(String[] args){
		Board board = new Board();
		Piece b1 = new Piece();
		Piece r1 = new Piece();

		b1.set(Piece.Color.BLACK);
		r1.set(Piece.Color.RED);

		board.set(b1, 1, 1);
		board.set(r1, 7, 7);

		System.out.println("Board created and pieces set.");
		System.out.println("Piece 1 is " + b1.get(0));
		System.out.println("Piece 2 is " + r1.get(1));

		System.out.println("Is there a piece on square 2x2:" + board.check(2,2));
		System.out.println("Is there a piece on square 7x7:" + board.check(7,7));
	}
}
