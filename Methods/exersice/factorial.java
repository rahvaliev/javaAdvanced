package Methods.exersice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        if(num1<0){
            return;
        }else if(num1==0){
            num1=1;
        }
        if(num2<0){
            return;
        }else if(num2==0){
            num2=1;
        }
        factor(num1);
        factor(num2);
        System.out.printf("%.2f",factor(num1)/factor(num2));
    }

    private static double factor(int num1) {
        int factor=1;
        for (int i = 1; i <=num1 ; i++) {
            factor*=i;
        }
        return factor*1.0;
    }
}
