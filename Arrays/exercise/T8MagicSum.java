package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T8MagicSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int n=Integer.parseInt(scanner.nextLine());
        for (int index = 0; index < numbers.length; index++) {
            for (int rightIndex = index+1; rightIndex <numbers.length ; rightIndex++) {
                if(numbers[index]+numbers[rightIndex]==n){
                    System.out.printf("%d %d \n",numbers[index],numbers[rightIndex]);
                }

            }

        }
    }
}
