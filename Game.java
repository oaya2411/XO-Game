import java.awt.*;
import java.util.Objects;
import java.util.Scanner;
public class gameManeger {
    private Board board;
     player[] players = null;
   private static int turn = 0;
    private static int x, y;
    public gameManeger(
            Board board,
            player[] player) {
    }
    public gameManeger(){}
    public void play_game() {
        while (true) {
            for (int i = 1; i <= 2; ++i) {
                players = new player[i];
                players[i].getMove(x,y);
                while (!board.displayBoard()){
                    players = new player[i];
                    players[i].getMove(x, y);
                }
               board.displayBoard();
                if (board.isWinner()){
                    System.out.println(players[i].getName() + " wins\n");
                    return;
                }
                if (board.isDraw()){
                    System.out.println("Draw!\n");
                    return;
                }
            }
        }
    }
}
