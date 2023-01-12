package Methods.lab;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        signNumber(num);
    }

    private static void signNumber(int num) {
        if(num<0){
            System.out.printf("The number %d is negative.",num);
        }else if(num==0){
            System.out.printf("The number 0 is zero.");
        }else {
            System.out.printf("The number %d is positive.\n",num);
        }
    }
}
