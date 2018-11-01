package Chess;

public class Piece {

 public static enum Color { RED, BLACK }
 private static int number = 0;

 private int id;
 private Color color;

 public void set(Color c){
 	id = number;
	color = c;
	number++;
 }

 public Color get(int i){
 		return color;
 }

}
