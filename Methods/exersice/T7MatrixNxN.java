package Methods.exersice;

import java.util.Scanner;

public class T7MatrixNxN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        printMatrix(n);
    }

    private static void printMatrix(int q) {
        for (int i = 0; i <q ; i++) {
            printLine(q);

        }
    }

    private static void printLine(int m) {
        for (int i = 0; i <m ; i++) {
            System.out.print(m+" ");
        }
        System.out.println();
    }
}
