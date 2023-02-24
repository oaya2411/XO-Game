import java.sql.SQLOutput;
import java.util.Scanner;




class player {
    private String name;
    private char symbol;

    public player(String Name, char Symbol) {
        this.name = Name;
        this.symbol = Symbol;
    }

    String getName() {
        return name;

    }

    char getSymbol() {
        return symbol;
    }

    void getMove(int x, int y) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your move:");
        x = in.nextInt();
        y = in.nextInt();


    }
}
