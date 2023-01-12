package Methods.lab;

import java.util.Scanner;

public class T6calculateRactangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double width=Double.parseDouble(scanner.nextLine());
        double lenght=Double.parseDouble(scanner.nextLine());
        double area=getRectangleArea(width,lenght);
        System.out.printf("%.0f",area);
    }

    private static double getRectangleArea(double width, double lenght) {
        double rectangleArea=width*lenght;
        return rectangleArea;
    }
}
