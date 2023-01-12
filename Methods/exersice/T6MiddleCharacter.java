package Methods.exersice;

import java.util.Scanner;

public class T6MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {
        int middleCharacter=input.length()/2;
        if(input.length()%2==0){
            System.out.println(input.charAt(middleCharacter-1) + ""+ input.charAt(middleCharacter));
        }else {
            System.out.println(input.charAt(middleCharacter));
        }
    }
}
