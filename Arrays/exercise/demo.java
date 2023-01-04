package Arrays.exercise;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

    int []numbers={10,58,5,69,58,2,4};
        Arrays.sort(numbers);
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        for (int num:numbers) {
            System.out.print(num+" ");
        }
    }
}
