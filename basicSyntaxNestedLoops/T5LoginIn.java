package basicSyntaxNestedLoops;

import java.util.Scanner;

public class T5LoginIn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username=scanner.nextLine();
        String input=scanner.nextLine();
        String password="";
        for (int symbol = username.length()-1; symbol >=0 ; symbol--) {
            char currentsymbol=username.charAt(symbol);
            password+=currentsymbol;
        }
        int countTry=0;
        while (!input.equals(password)){
            countTry++;
            if(countTry==4){
                System.out.printf("User %s blocked!",username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            input=scanner.nextLine();
        }
        System.out.printf("User %s logged in.",username);
    }
}
