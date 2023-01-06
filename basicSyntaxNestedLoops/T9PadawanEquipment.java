package basicSyntaxNestedLoops;

import java.util.Scanner;

public class T9PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int students=Integer.parseInt(scanner.nextLine());
        double priceLightSaber=Double.parseDouble(scanner.nextLine());
        double priceRobe=Double.parseDouble(scanner.nextLine());
        double priceBelt=Double.parseDouble(scanner.nextLine());
        double total=priceLightSaber*(Math.ceil(students*1.1))+priceRobe*students+priceBelt*(students-students/6);
        if(budget>=total){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",total-budget);
        }
    }
}
