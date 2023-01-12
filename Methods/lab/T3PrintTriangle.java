package Methods.lab;

import java.util.Scanner;

public class T3PrintTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int height=Integer.parseInt(scanner.nextLine());
        printPyramid(height);
    }

    private static void printPyramid(int height) {
        printTopHalf(height);
        printBottomHalf(height);
    }


    private static void printTopHalf(int height) {
        for (int i = 1; i <height ; i++) {
            printLine(i);

        }
    }

    private static void printLine(int lenght) {
        for (int j = 1; j <=lenght ; j++) {
            System.out.print(j+" ");

        }
        System.out.println();
    }

    private static void printBottomHalf(int height) {
        for (int i = height; i >=1 ; i--) {
            printLine(i);

        }
    }


}
