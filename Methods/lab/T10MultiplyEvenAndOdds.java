package Methods.lab;

import java.util.Scanner;

public class T10MultiplyEvenAndOdds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultipleOfEvenAndOdds(input));
    }

    private static int getMultipleOfEvenAndOdds(int input) {
        int sumEven=getSumEven(input);
        int sumOdds=getSumOdds(input);
        return sumEven*sumOdds;
    }

    private static int getSumOdds(int input) {
        int sumOdd=0;
        while (input>0){
            int digit=0;
            digit=input%10;
            if(digit%2!=0){
                sumOdd+=digit;
            }
            input/=10;
        }
        return sumOdd;
    }

    private static int getSumEven(int input) {
        int sumEven=0;
        while (input>0){
            int digit=0;
            digit=input%10;
            if(digit%2==0){
                sumEven+=digit;
            }
            input/=10;
        }
        return sumEven;

    }
}
