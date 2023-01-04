package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class T3SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int[] numbers= Arrays.stream(scanner.nextLine().split(" "))
               .mapToInt(e ->Integer.parseInt(e) ).toArray();
       int sumEvenNumbers=0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]%2==0){
                sumEvenNumbers+=numbers[i];
            }

        }
        System.out.println(sumEvenNumbers);
    }
}
