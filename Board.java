import java.util.Objects;
import java.util.Scanner;

public class Board {
    public static int sum = 0;
    /*private static int colms;
    private static int rows;*/
    private char[][] board = new char[3][3];
    public void displayBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
    }
    Scanner cin = new Scanner(System.in);
    public void updateBoard(int row, int col, char Symbol){
        if(board[row][col] == '-') {
            board[row][col] = Symbol;
        }else{
            int rr = 0;
            System.out.println("This position can't be used, please choose empty index");
            System.out.println("please enter the row: ");
            rr = cin.nextInt();
            row = rr;
            int cc = 0;
            System.out.println("please enter the column: ");
            cc = cin.nextInt();
            col = cc;
            board[row][col] = Symbol;

        }
        System.out.println("The Board Updated To");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
    }
    public void isWinner() {
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 1; i++) {
                if ((Objects.equals(board[i][j], board[i + 1][j]) && Objects.equals(board[i][j], board[i + 2][j])
                ) && (board[i][j] != '-' && board[i + 1][j] != '-' && board[i + 2][j] != '-')) {//colms
                    sum += 1;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                if ((Objects.equals(board[i][j], board[i][j + 1]) && Objects.equals(board[i][j], board[i][j + 2]))
                        && (board[i][j] != '-' && board[i][j + 1] != '-' && board[i][j + 2] != '-')) {//rows
                    sum += 1;
                }
            }
        }

        for (int i = 0; i < 1; i++) {//diagonals check
            for (int j = 0; j < 1; j++) {
                if ((Objects.equals(board[i][j], board[i + 1][j + 1]) && Objects.equals(board[i][j], board[i + 2][j + 2]))
                        && (board[i][j] != '-')) {
                    sum += 1;
                } else if ((Objects.equals(board[0][2], board[1][1]) && Objects.equals(board[1][1], board[2][0])
                        && (board[0][2] != '-' ))) {
                    sum += 1;
                }
            }
        }
    }
    public void isDraw(){
        if(sum == 0){
            System.out.println("The Game Finished, You Both Drew");
        }
    }

}


