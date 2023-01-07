package List.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> sequence= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command=scanner.nextLine();
        int[] commandData=Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
        int bombNumber=commandData[0];
        int power=commandData[1];
         while (sequence.contains(bombNumber)){
             int start=sequence.indexOf(bombNumber)-power;
             int end=sequence.indexOf(bombNumber)+power;
             if(start<0){
                 start=0;
             }
             if(end>=sequence.size()){
                 end= sequence.size()-1;
             }
             for (int i = start; i <=end; i++) {
                 sequence.remove(start);

             }
         }
         int sum=0;
        for (int i = 0; i <sequence.size() ; i++) {
            sum+=sequence.get(i);
        }
        System.out.println(sum);
    }
}
