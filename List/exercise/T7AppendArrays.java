package List.exercise;

import java.util.Scanner;

public class T7AppendArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input =scanner.nextLine();
        String[] arrays=input.split("\\|");
        for (int index = arrays.length-1; index >=0 ; index--) {
            String currentArray=arrays[index];
            String[] numbers=currentArray.split("\\s+");
            for (String number:numbers) {
                if(number.equals("")){
                    continue;
                }else {
                System.out.print(number +" ");
                }
            }


        }
    }
}
