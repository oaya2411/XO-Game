import java.util.Objects;

public class Board {
    public static int sum = 0;
    private static int colms;
    private static int rows;
    private String[][] board = new String[3][3];
    public void displayBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = "-";
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
    }

    public void updateBoard(int col, int r){
        board[col][r] = "symbol";
        System.out.println("The Board Updated To");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("|" + board[i][j]);
            }
            System.out.println("|");
        }
    }
    public void isWinner(){
        for(int i = 0; i < 1; i++){//diagonals check
            for(int j = 0; j < 1; j++){
                if((Objects.equals(board[i][j], board[i + 1][j + 1]) && Objects.equals(board[i][j], board[i + 2][j + 2]))
                   && !Objects.equals(board[i][j], "-")){
                    System.out.println("Found Winner3");
                    sum += 1;
                }
                else if(Objects.equals(board[0][2], board[1][1]) && Objects.equals(board[1][1], board[2][0])
                        && !Objects.equals(board[0][2], "-")){
                    System.out.println("Found Winner4");
                    sum += 1;
                }
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 1; j++){
                if(Objects.equals(board[i][j], board[i][j + 1]) && Objects.equals(board[i][j], board[i][j + 2])
                        && !Objects.equals(board[i][j], "-")){//rows
                    System.out.println("Found Winner1");
                    sum += 1;
                }
            }
        }
        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 1; i++){
                if(Objects.equals(board[i][j], board[i + 1][j]) && Objects.equals(board[i][j], board[i + 2][j])
                        && !Objects.equals(board[i][j], "-")){//colms
                    System.out.println("Found Winner2");
                    sum += 1;
                }
            }
        }
    }

    public void isDraw(){
        if(sum == 0){
            System.out.println("The Game Finish, You Both Drew");
        }

    }

}


