package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class T7CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] num= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e) ).toArray();
       while (num.length>1){
           int[] condense= new int[num.length-1];
           for (int i = 0; i <condense.length ; i++) {
               condense[i]=num[i]+num[i+1];
           }
           num=condense;
       }

        System.out.println(num[0]);
    }
}
