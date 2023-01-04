package Arrays.exercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CaminoFactory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lenght=Integer.parseInt(scanner.nextLine());
        int maxLenght=0;
        int currentLenght=1;
        int currentindex=0;
        int maxIndex=0;
        int sum=0;
        int maxSum=0;
        int[]bestDNA=new int[lenght];
        int countSamples=0;
        int bestSample=0;
        String input=scanner.nextLine();
        while (!input.equals("Clone them!")){
            int[]sequences= Arrays.stream(input.split("!")).mapToInt(e -> Integer.parseInt(e)).toArray();
            countSamples++;
            sum=0;
            for (int i = 0; i <sequences.length ; i++) {
            sum+=sequences[i];
            }
            for (int i = 0; i <sequences.length-1 ; i++) {
                if(sequences[i]==sequences[i+1]){
                    currentLenght++;

                }else {
                    currentindex = i;
                    if (maxLenght < currentLenght) {
                        maxLenght = currentLenght;
                        maxIndex = i - maxLenght + 1;
                        maxSum = sum;
                        bestDNA = sequences;
                        bestSample = countSamples;
                    } else if (maxLenght == currentLenght) {

                        if (currentindex < maxIndex) {
                            maxLenght = currentLenght;
                            maxIndex = i - maxLenght + 1;
                            maxSum = sum;
                            bestDNA = sequences;
                            bestSample = countSamples;
                        } else if (currentindex == maxIndex) {

                            if (maxSum < sum) {
                                maxLenght = currentLenght;
                                maxIndex = i - maxLenght + 1;
                                maxSum = sum;
                                bestDNA = sequences;
                                bestSample = countSamples;
                            }
                        }


                        currentLenght = 1;


                    }
                }


            }





            input=scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.",bestSample,maxSum);
        System.out.println();
        for (int n:bestDNA) {
            System.out.print(n+" ");
        }

    }
}
