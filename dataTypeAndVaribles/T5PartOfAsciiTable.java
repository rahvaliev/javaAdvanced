package dataTypeAndVaribles;

import java.util.Scanner;

public class T5PartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int start=Integer.parseInt(scanner.nextLine());
        int end=Integer.parseInt(scanner.nextLine());
        char symbol=' ';
        for (int i = start; i <=end ; i++) {
            symbol=(char) i;
            System.out.print(symbol+" ");
        }

    }
}
