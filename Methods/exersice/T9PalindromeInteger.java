package Methods.exersice;

import java.util.Scanner;

public class T9PalindromeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String comand=scanner.nextLine();
        while (!comand.equals("END")){
            System.out.println(isPalindrome(comand));
            comand=scanner.nextLine();
        }
    }
    private  static  boolean isPalindrome(String number){
        String reversedNumber=getReversd(number);
        return number.equals(reversedNumber);
    }

    private static String getReversd(String ads) {
        String reversed="";
        for (int index = ads.length()-1; index >=0 ; index--) {
            reversed+=ads.charAt(index);

        }
        return reversed;
    }

}
