package basicSyntaxNestedLoops;

import java.util.Scanner;

public class T32Vacation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int people =Integer.parseInt(scanner.nextLine());
        String typeGroup=scanner.nextLine();
        String day=scanner.nextLine();
        double discount=0.0;
        double roomPrice=0.0;
        switch (day) {
            case ("Friday"):
                switch (typeGroup) {
                    case ("Students"):
                        roomPrice = 8.45;
                        break;
                    case ("Business"):
                        roomPrice = 10.90;
                        break;
                    case ("Regular"):
                        roomPrice = 15.0;
                        break;
                }
                break;
            case ("Saturday"):
                switch (typeGroup) {
                    case ("Students"):
                        roomPrice = 9.80;
                        break;
                    case ("Business"):
                        roomPrice = 15.6;
                        break;
                    case ("Regular"):
                        roomPrice = 20.0;
                        break;
                }
                break;
            case ("Sunday"):
                switch (typeGroup) {
                    case ("Students"):
                        roomPrice = 10.46;
                        break;
                    case ("Business"):
                        roomPrice = 16.0;
                        break;
                    case ("Regular"):
                        roomPrice = 22.5;
                        break;
                }
                break;
        }
        switch (typeGroup) {
            case "Students":
                if(people>=30){
                    discount=0.85;
                }else {
                    discount=1;
                }
                break;
            case "Business":
                if(people>=100){
                    discount=0.9;
                }else {
                    discount=1;
                }
                break;
            case"Regular":
                if(people>=10 && people<=20){
                    discount=0.95;
                }else {
                    discount=1;
                }
                break;
        }
        double total=roomPrice*people*discount;
        System.out.printf("Total price: %.2f",total);

    }
}
