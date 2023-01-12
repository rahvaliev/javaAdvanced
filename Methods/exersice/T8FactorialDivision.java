package Methods.exersice;

import java.util.Scanner;

public class T8FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=Math.abs(Integer.parseInt(scanner.nextLine()));
        int num2=Math.abs(Integer.parseInt(scanner.nextLine()));
        if(num1==0 ){
            num1=1;
        }
        if(num2==0){
            num2=1;
        }
        System.out.printf("%.2f",division(num1,num2));


    }

    private static double division(int x,int y) {
        int division=factorial(x)/factorial(y);
        return division*1.0;
    }

    private static int factorial(int n) {
        int factorial=1;
        for (int i = 1; i <=n ; i++) {
            factorial*=i;


        }
        return factorial;
    }
}
