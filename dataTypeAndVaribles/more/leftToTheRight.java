package dataTypeAndVaribles.more;

import java.util.Arrays;
import java.util.Scanner;

public class leftToTheRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <n ; i++) {
            long sum = 0;
            long[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(e -> Long.parseLong(e)).toArray();
            if (numbers[0] < numbers[1]) {
                long digits = 0;
                digits = numbers[1] % 10;      numbers[1]=Math.abs(numbers[1]);

                while (numbers[1] > 0) {

                    sum += digits;
                    numbers[1] /= 10;
                }


            } else {
                numbers[0]=Math.abs(numbers[0]);
                long digits = 0;

                while (numbers[0] > 0) {
                    digits = numbers[0] % 10;
                    sum += digits;
                    numbers[0] /= 10;

                }

            }
            System.out.println(sum);
        }
        System.out.println();
    }
}
