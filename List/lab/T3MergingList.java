package List.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T3MergingList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> firstList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i <Math.min(firstList.size(), secondList.size()) ; i++) {
            System.out.print(firstList.get(i)+" "+secondList.get(i)+" ");
        }
        if(firstList.size()>secondList.size()){
            for (int i = secondList.size(); i < firstList.size() ; i++) {
                System.out.print(firstList.get(i)+" ");
            }
        }else {
            for (int i = firstList.size(); i < secondList.size() ; i++) {
                System.out.print(secondList.get(i)+" ");

            }
        }
    }
}
