package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T4ListOperation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers =Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command=scanner.nextLine();
        while (!command.equals("End")){
            String[]commandData=command.split("\\s+");
            /*
                • Add {number} - add number at the end
    • Insert {number} {index} - insert number at given index
    • Remove {index} - remove that index
    • Shift left {count} - first number becomes last 'count' times
    • Shift right {count} - last number becomes first 'count' times
Note: The index given may be outside of the bounds of the array. In that case print "Invalid index".
             */
            switch (commandData[0]){
                case("Add"):
                    int addNumber=Integer.parseInt(commandData[1]);
                    numbers.add(addNumber);
                    break;
                case("Insert"):
                    int numberToINsert=Integer.parseInt(commandData[1]);
                    int insertIndex=Integer.parseInt(commandData[2]);
                    if(isValidIndex(insertIndex,numbers.size())){
                        numbers.add(insertIndex,numberToINsert);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case("Remove"):
                    int removeIndex=Integer.parseInt(commandData[1]);
                    if(isValidIndex(removeIndex,numbers.size())){
                        numbers.remove(removeIndex);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case("Shift"):
                    String direction=commandData[1];
                    if(direction.equals("left")){
                        int count=Integer.parseInt(commandData[2]);
                        shiftLeft(numbers,count);

                    }else if(direction.equals("right")){
                        int count=Integer.parseInt(commandData[2]);
                        shiftRight(numbers,count);

                    }
            }




            command=scanner.nextLine();
        }
        for (int number:numbers) {
            System.out.print(number+" ");
        }

    }

    private static void shiftRight(List<Integer> numbers, int count) {
        for (int i = 0; i <count ; i++) {
            int lastNumber= numbers.get(numbers.size()-1);
            numbers.add(0,lastNumber);
            numbers.remove(numbers.size()-1);

        }
    }

    private static void shiftLeft(List<Integer> numbers, int count) {
        for (int i = 0; i <count ; i++) {
        int firstNumber= numbers.get(0);
        numbers.add(firstNumber);
        numbers.remove(0);
        }
    }

    public static boolean isValidIndex ( int index, int size){
        return 0<=index && index<=size-1;
    }
}
