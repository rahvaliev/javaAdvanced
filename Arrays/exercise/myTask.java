package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class myTask {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] row= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e) ).toArray();

        for (int index = 0; index < row.length; index++) {

            for (int rightIndex = index+1; rightIndex < row.length; rightIndex++) {
              if(row[index]<row[rightIndex]) {
                  int current = row[index];
                  row[index] = row[rightIndex];
                  row[rightIndex] = current;
              }

            }
            System.out.print(row[index]+" ");

        }
    }
}
