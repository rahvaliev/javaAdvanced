package Methods.exersice;

import com.sun.xml.internal.bind.v2.TODO;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class T11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] initial= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command=scanner.nextLine();
        while (!command.equals("end")){
            String[] commandData=command.split(" ");
            switch (commandData[0]){
                case ("exchange"):
                    int index=Integer.parseInt(commandData[1]);
                   if( isValidIndex(initial,index)){
                       exchange(initial,index);
                   }else {
                       System.out.println("Invalid index");
                   }
                    break;
                case ("max"):
                    if(commandData[1].equals("odd")){
                        printMaxOddIndex(initial);
                    }else if(commandData[1].equals("even")){
                        printMaxEvenIndex(initial);
                    }
                    break;
                case ("min"):
                    if(commandData[1].equals("odd")){
                        printMinOddIndex(initial);
                    }else if(commandData[1].equals("even")){
                        printMinEvenIndex(initial);
                    }
                    break;
                case ("first"):
                    int count=Integer.parseInt(commandData[1]);
                    if(commandData[2].equals("even")){
                        printArrayFirstEven(initial,count);
                    } else if (commandData[2].equals("odd")) {
                        printArrayFirstOdd(initial,count);

                    }
                    break;
                case ("last"):
                    count=Integer.parseInt(commandData[1]);
                    if(commandData[2].equals("even")){
                 //       printArrayLastEven(initial,count);
                    } else if (commandData[2].equals("odd")) {
                   //     printArrayLastOdd(initial,count);

                    }

                    break;
            }



            command=scanner.nextLine();
        }
        System.out.println(Arrays.toString(initial));
    }

    private static void printArrayFirstOdd(int[] initial, int count) {
        if(count> initial.length){
            System.out.println("Invalid count");
            return;
        }
        int[] firstCountOdd=new int[initial.length];
        for (int i = 0; i < initial.length ; i++) {
            if(count>0 && initial[i]%2!=0){
                firstCountOdd[i]=initial[i];
                count--;
            }else {
                firstCountOdd[i]=-1;
            }
        }
        printArray(firstCountOdd);
    }

    private static void printArrayFirstEven(int[] initial, int count) {
        if(count> initial.length){
            System.out.println("Invalid count");
            return;
        }
        int[] firstCountEven=new int[initial.length];
        for (int i = 0; i < initial.length ; i++) {
            if(count>0 && initial[i]%2==0){
                firstCountEven[i]=initial[i];
                count--;
            }else {
                firstCountEven[i]=-1;
            }
        }
        printArray(firstCountEven);
    }

    private static void printArray(int[] array) {
        System.out.print("[");
        boolean printFirst = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                if (printFirst) {

                    System.out.print(array[i]);
                    printFirst = false;
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        }
        System.out.println("]");
    }

    private static void printMinEvenIndex(int[] initial) {
        int min=Integer.MAX_VALUE;
        int minIndex=-1;
        for (int i = 0; i <initial.length ; i++) {
            if(initial[i]%2==0 && initial[i]<min){
                min=initial[i];
                minIndex=i;
            }
        }
        if(minIndex==-1){
            System.out.println("No matches");
        }else {
            System.out.println(minIndex);
        }
    }

    private static void printMinOddIndex(int[] initial) {
        int min=Integer.MAX_VALUE;
        int minIndex=-1;
        for (int i = 0; i <initial.length ; i++) {
            if(initial[i]%2!=0 && initial[i]<min){
                min=initial[i];
                minIndex=i;
            }
        }
        if(minIndex==-1){
            System.out.println("No matches");
        }else {
            System.out.println(minIndex);
        }
    }

    private static void printMaxEvenIndex(int[] initial) {
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for (int i = 0; i < initial.length; i++) {
            if(initial[i]%2==0 && initial[i]>max){
                max=initial[i];
                maxIndex=i;
            }
        }
        if(maxIndex==-1){
            System.out.println("No matches");
        }else {
            System.out.println(maxIndex);
        }
    }

    private static void printMaxOddIndex(int[] initial) {
        int max=Integer.MIN_VALUE;
        int maxIndex=-1;
        for (int i = 0; i < initial.length; i++) {
            if(initial[i]%2!=0 && initial[i]>max){
                max=initial[i];
                maxIndex=i;
            }
        }
        if(maxIndex==-1){
            System.out.println("No matches");
        }else {
            System.out.println(maxIndex);
        }

    }

    private static void exchange(int[] initial, int index) {
        int[]first=new int[index+1];
        int[]second=new int[initial.length-index-1];
        for (int i = 0; i <index+1 ; i++) {
            first[i]=initial[i];
        }
        for (int i = 0; i < initial.length-index-1 ; i++) {
            second[i]=initial[i+index+1];
        }
        for (int i = 0; i <initial.length ; i++) {
            if(i< second.length){
                initial[i]=second[i];
            }else {
                initial[i]=first[i- second.length];
            }
        }
    }

    private static boolean isValidIndex(int[] initial, int index) {
        return (index>=0 && index<initial.length);
    }
}
