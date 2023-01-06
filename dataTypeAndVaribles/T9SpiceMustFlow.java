package dataTypeAndVaribles;

import java.util.Scanner;

public class T9SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int startingYield=Integer.parseInt(scanner.nextLine());
        int totalAmount=0;
        int countDays=0;
        while (startingYield>=100){
            totalAmount+=startingYield-26;
            countDays++;
            startingYield-=10;
        }
        if(totalAmount>26){
            totalAmount-=26;
        }
        System.out.println(countDays);
        System.out.println(totalAmount);
    }
}
