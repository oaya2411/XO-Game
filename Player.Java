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

    String getMove(){

    Scanner in = new Scanner(System.in);
    System.out.println("Please enter your move:");
    //this string contains two values( first is the x-acix, and second is y-acix
    String x = in.nextLine();
    return x;
}
}
