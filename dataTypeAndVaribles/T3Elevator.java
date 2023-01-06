package dataTypeAndVaribles;

import java.util.Scanner;

public class T3Elevator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberPeople=Integer.parseInt(scanner.nextLine());
        int capasityP=Integer.parseInt(scanner.nextLine());
        double courses=Math.ceil( numberPeople*1.0/capasityP);
        System.out.printf("%.0f",courses);
    }
}
