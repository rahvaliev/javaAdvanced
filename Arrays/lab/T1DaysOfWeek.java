package Arrays.lab;

import java.util.Scanner;

public class T1DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
     int currenrDay=Integer.parseInt(scanner.nextLine());
     String [] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
     if(currenrDay>=1 && currenrDay<=7) {
         System.out.println(days[currenrDay - 1]);
     }else {
         System.out.println("Invalid day!");
     }


    }
}
