import java.util.Scanner;
public class Main {
  public static void main(String []args){

    Board b = new Board();
    b.displayBoard();
    b.updateBoard(0, 1);
    b.updateBoard(0, 0);
    b.isWinner();
    b.isDraw();
  }


}