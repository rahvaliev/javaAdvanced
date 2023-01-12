package Methods.exersice;

import java.util.Scanner;

public class T3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char symbol1=scanner.nextLine().charAt(0);
        char symbol2=scanner.nextLine().charAt(0);
        printSequenceBetween2Char(symbol1,symbol2);
    }

    private static void printSequenceBetween2Char(char start, char end) {
        if (start < end) {
            for (int index = start + 1; index < end; index++) {
                System.out.print((char) index + " ");

            }
        } else {
            for (int index = end + 1; index < start; index++) {
                System.out.print((char) index + " ");
            }
        }
    }
}
