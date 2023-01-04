package Arrays.more;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class T1EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] symbols = (input.split(""));
            int sumSymbol = 0;
            for (int j = 0; j < symbols.length; j++) {
                int valueChar = (int) (symbols[j].charAt(0));
                if (symbols[j].charAt(0)=='a' || symbols[j].charAt(0) == 'e' || valueChar == 105 || valueChar == 111 || valueChar == 117 ||valueChar==65||valueChar==69||valueChar==73||valueChar==79||valueChar==85) {
                    sumSymbol+=valueChar*symbols.length;
                }else {
                    sumSymbol+=valueChar/symbols.length;
                }

            }
            sum[i] = sumSymbol;

        }
        Arrays.sort(sum);




        for (int s : sum) {
            System.out.println(s);
        }
    }
}
