package basicSyntaxNestedLoops;

import java.util.Scanner;

public class T3Vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int people =Integer.parseInt(scanner.nextLine());
        String typeGroup=scanner.nextLine();
        String day=scanner.nextLine();
        double discount=1;
        double roomPrice=0.0;
        switch (day){
            case ("Friday"):
                if ("Students".equals(typeGroup)) {
                    roomPrice = 8.45;
                    if (people >= 30) {
                        discount = 0.85;
                    }
                } else if ("Business".equals(typeGroup)) {
                    roomPrice = 10.90;
                    if (people >= 100) {
                        discount = 0.9;
                    }
                } else if ("Regular".equals(typeGroup)) {
                    roomPrice = 15.0;
                    if (people >= 10 && people <= 20) {
                        discount = 0.95;
                    }
                }
                break;
            case ("Saturday"):
                if ("Students".equals(typeGroup)) {
                    roomPrice = 9.80;
                    if (people >= 30) {
                        discount = 0.85;
                    }
                } else if ("Business".equals(typeGroup)) {
                    roomPrice = 15.6;
                    if (people >= 100) {
                        discount = 0.9;
                    }
                } else if ("Regular".equals(typeGroup)) {
                    roomPrice = 20.0;
                    if (people >= 10 && people <= 20) {
                        discount = 0.95;
                    }
                }
                break;
            case ("Sunday"):
                if ("Students".equals(typeGroup)) {
                    roomPrice = 10.46;
                    if (people >= 30) {
                        discount = 0.85;
                    }
                } else if ("Business".equals(typeGroup)) {
                    roomPrice = 16.0;
                    if (people >= 100) {
                        discount = 0.9;
                    }
                } else if ("Regular".equals(typeGroup)) {
                    roomPrice = 22.5;
                    if (people >= 10 && people <= 20) {
                        discount = 0.95;
                    }
                }
                break;
        }
        double total=roomPrice*people*discount;
        System.out.printf("Total price: %.2f",total);
    }
}
