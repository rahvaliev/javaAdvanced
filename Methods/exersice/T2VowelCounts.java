package Methods.exersice;

import java.util.Locale;
import java.util.Scanner;

public class T2VowelCounts {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine().toLowerCase();
        vowelCounts(input);
    }

    private static void vowelCounts(String input) {
        int count=0;
        for (int index = 0; index <input.length() ; index++) {
            char symbol=input.charAt(index);
            switch (symbol){
                case 'a':
                case 'o':
                case 'u':
                case 'e':
                case 'i':
                    count++;
                    break;
            }

        }
        System.out.println(count);
    }
}
