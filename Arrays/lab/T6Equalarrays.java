package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class T6Equalarrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] firstArray= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e) ).toArray();
                
        int[]secondArray=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e) ).toArray();
        boolean equal=false;
        int index=0;
        int sum=0;
        for (int i = 0; i <firstArray.length ; i++) {
            equal=false;

            if(firstArray[i]==secondArray[i]){
                equal=true;
                sum+=firstArray[i];
            }else {
                index=i;
                break;
            }
            
        }
        if (equal){
            System.out.printf("Arrays are identical. Sum: %d",sum);

        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",index);
        }
    }
}
