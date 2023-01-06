package dataTypeAndVaribles;

import java.util.Scanner;

public class T8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
/*
    • First – model – string.
    • Second –radius – floating-point number
    • Third – height – integer number
 */
        int n=Integer.parseInt(scanner.nextLine());
        double max = Integer.MIN_VALUE;
        String maxModelKeg=" ";
        for (int i = 0; i <n ; i++) {


            String model = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if(volume>max){
                max=volume;
                maxModelKeg=model;
            }

        }
        System.out.printf("%s",maxModelKeg);

    }
}
