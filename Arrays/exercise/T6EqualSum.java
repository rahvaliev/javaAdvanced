package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T6EqualSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input =scanner.nextLine();
        int [] number= Arrays.stream(input.split(" ")).mapToInt(e ->Integer.parseInt(e)).toArray();
        boolean isFound=false;


        for (int index = 0; index <number.length ; index++) {
            int current=number[index];
            int leftSum=0;
            int rightSum=0;

            for (int leftindex = 0; leftindex <index ; leftindex++) {
                leftSum+=number[leftindex];
            }
            for (int rightIndex = index+1; rightIndex <number.length ; rightIndex++) {
                rightSum+=number[rightIndex];
            }
             if(leftSum==rightSum){
                 System.out.println(index);
                 isFound=true;
             }


        }
        if(!isFound){
            System.out.println("no");
        }
    }
}
