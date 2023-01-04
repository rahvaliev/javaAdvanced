package Arrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class T4ReversArrayString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] initalArray= scanner.nextLine().split(" ");
        for (int i = 0; i <initalArray.length/2 ; i++) {
            String current=initalArray[i];
            initalArray[i]=initalArray[initalArray.length-(1+i)];
            initalArray[initalArray.length-(1+i)]=current;


        }
        System.out.println(String.join(" ",initalArray));
    }
}
