package dataTypeAndVaribles;

import java.util.Scanner;

public class T6TripleLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        char first=' ';
        char second=' ';
        char third=' ';
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                for (int k = 0; k < n; k++) {
                    first=(char)('a'+i);
                    second=(char)('a'+j);
                    third=(char)('a'+k);


                    System.out.printf("%c%c%c\n",first,second,third);
                }

            }

        }

    }
}
