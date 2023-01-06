package basicSyntaxNestedLoops.moreExercise;

import java.util.Scanner;

public class T1SortNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x=Double.parseDouble(scanner.nextLine());
        double y=Double.parseDouble(scanner.nextLine());
        double z=Double.parseDouble(scanner.nextLine());
        double first=0;
        double second=0;
        double third=0;
        if(x>y && x>z){
            if(y>z){
                first=x;
                second=y;
                third=z;
            }else {
                first=x;
                second=z;
                third=y;
            }
        }else if(y>x && y>z){
            if(x>z){
                first=y;
                second=x;
                third=z;
            }else {
                first=y;
                second=z;
                third=x;
            }
        }else if(z>x && z>y){
            if(x>y){
                first=z;
                second=x;
                third=y;
            }else {
                first=z;
                second=y;
                third=x;
            }
        }
        System.out.printf("%.0f\n",first);
        System.out.printf("%.0f\n",second);
        System.out.printf("%.0f\n",third);
    }
}
