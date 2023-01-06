package basicSyntaxNestedLoops;

import java.util.Scanner;

public class T8YTriangleNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        for (int row = 1; row <=n ; row++) {
            for (int objects = 1; objects <=row ; objects++) {
                System.out.print(row+" ");

            }
            System.out.println();

        }
    }
}
