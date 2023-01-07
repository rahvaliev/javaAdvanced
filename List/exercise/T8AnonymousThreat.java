package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T8AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> input= Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command=scanner.nextLine();
        String mergeInput="";
        while (!command.equals("3:1")) {
            String[] commandData = command.split(" ");
            /*
                • merge {startIndex} {endIndex}
    • divide {index} {partitions}
             */
            if (commandData[0].equals("merge")) {
                int startIndex = Integer.parseInt(commandData[1]);
                int endIndex = Integer.parseInt(commandData[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;
                }
                if (startIndex < input.size() && endIndex>0) {
                        mergeInput = "";
                        for (int i = startIndex; i <= endIndex; i++) {
                            mergeInput += input.get(i);
                            input.set(startIndex, mergeInput);
                        }
                        for (int i = endIndex; i > startIndex; i--) {
                            input.remove(i);
                        }
                }




            }else if(commandData[0].equals("divide")){
                int index =Integer.parseInt(commandData[1]);
                int partitions=Integer.parseInt(commandData[2]);
                String partForDivition=input.get(index);
                input.remove(index);
                int sizeOfSubstrings=partForDivition.length()/partitions;
                int begin=0;
                for (int i = 1; i <partitions ; i++) {
                    input.add(index, partForDivition.substring(begin,begin+sizeOfSubstrings));
                    begin+=sizeOfSubstrings;
                    index++;
                }
                input.add(index,partForDivition.substring(begin));

            }

            command=scanner.nextLine();
        }
        System.out.println(String.join(" ",input));



    }
}
