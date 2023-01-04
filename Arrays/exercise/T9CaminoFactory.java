package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class T9CaminoFactory {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String comand=scanner.nextLine();
        String bestDNA=" ";
        int []best=new int[n];
        int leftmost=0;
        int count=0;
        int bestsequenceCount=0;
        while (!comand.equals("Clone them!")){
            count++;
            int[] dna= Arrays.stream(comand.split("!")).mapToInt(e ->Integer.parseInt(e) ).toArray();
            for (int index = 0; index < dna.length ; index++) {
                String currentDna=dna[index]+" ";
                int right=0;
                for (int rightIndex = index+1; rightIndex < dna.length ; rightIndex++) {
                    right=rightIndex;
                    if(dna[index]==dna[rightIndex]&& dna[index]==1){
                        currentDna+=dna[index]+" ";
                    }else {
                        break;
                    }
                }
                if(bestDNA.length()<currentDna.length()){
                    leftmost=index;
                    bestDNA=currentDna;
                    best=dna;
                    bestsequenceCount=count;
                }else if(bestDNA.length()==currentDna.length()){
                    if(leftmost>index){
                        bestDNA=currentDna;
                        best=dna;
                        bestsequenceCount=count;
                    }else {

                        int sumBestDNA = 0;
                        int sumCurrentDna = 0;
                        int[] arrayBestDNA = Arrays.stream(bestDNA.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
                        int[] arrayCurrentDna = Arrays.stream(bestDNA.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
                        for (int i = 0; i < arrayBestDNA.length; i++) {
                            sumBestDNA += arrayBestDNA[i];
                            sumCurrentDna += arrayCurrentDna[i];
                            if (sumBestDNA < sumCurrentDna) {
                                bestDNA = currentDna;
                                best = dna;
                                bestsequenceCount=count;
                            }

                        }
                    }

                }

            }





            comand=scanner.nextLine();
        }
        int sumbestsequence=0;
        for (int i : best) {
            sumbestsequence+=i;
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n",bestsequenceCount,sumbestsequence);

        for (int i : best) {
            System.out.print(i+" ");
        }
    }
}
