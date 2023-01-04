package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T5TopInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e ->Integer.parseInt(e)).toArray();
        boolean isBiggest=false;

        for (int index = 0; index <numbers.length ; index++) {
            int max=Integer.MIN_VALUE;

            for (int rightindex = index+1; rightindex <numbers.length ; rightindex++) {
                if(max<numbers[rightindex]){
                    max=numbers[rightindex];

                }

            }
            if(numbers[index]>max){
                System.out.print(numbers[index]+" ");
            }

        }


    }
}
