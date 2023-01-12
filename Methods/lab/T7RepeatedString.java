package Methods.lab;

import java.util.Scanner;

public class T7RepeatedString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String initial=scanner.nextLine();
        int n=Integer.parseInt(scanner.nextLine());
        String reversed=reversedString(initial,n);
        System.out.println(reversed);
    }

    private static String reversedString(String initial,int n) {
        String reveresed="";
        for (int i = 0; i <n ; i++) {
            reveresed+=initial;

        }
        return reveresed;

    }
}
