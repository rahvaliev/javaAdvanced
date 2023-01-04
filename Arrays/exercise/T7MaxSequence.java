package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T7MaxSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e ->Integer.parseInt(e) ).toArray();
        String maxSequence=" ";
        for (int index = 0; index < numbers.length-1; index++) {
            String max=numbers[index]+" ";
            for (int rightindex = index+1; rightindex < numbers.length; rightindex++) {
                if(numbers[index]==numbers[rightindex]){
                    max+=numbers[index]+" ";
                }else {
                    break;
                }


            }
            if(maxSequence.length()<max.length()){
                maxSequence=max;
            }


        }

        System.out.println(maxSequence);
    }
}
