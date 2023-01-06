package dataTypeAndVaribles;

import java.util.Scanner;

public class T7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int capacity=255;
        int n =Integer.parseInt(scanner.nextLine());
        int total=0;
        int available=0;
        for (int i = 0; i <n ; i++) {
            int litre=Integer.parseInt(scanner.nextLine());
            if(capacity>=litre){
                capacity-=litre;
                available+=litre;
            }else {
                System.out.println("Insufficient capacity!");
            }

        }

        System.out.println(available);
    }
}
