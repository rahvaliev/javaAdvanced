package basicSyntaxNestedLoops.moreExercise;

import java.util.Scanner;

public class T4ReversString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String initial=scanner.nextLine();
        String revers="";
        for (int symbol = initial.length()-1; symbol >=0 ; symbol--) {

            revers+=initial.charAt(symbol);
        }
        System.out.println(revers);
    }
}
