package List.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T4ListManipulationsBasics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command=scanner.nextLine();

        while (!command.equals("end")){
            String[]commandData=command.split(" ");
            String typeOfOperation=commandData[0];
            /*
            Add {number}: add a number to the end of the list
Remove {number}: remove a number from the list
RemoveAt {index}: remove a number at a given index
Insert {number} {index}: insert a number at a given index
             */
            switch (typeOfOperation){
                case("Add"):
                    int addNumber=Integer.parseInt(commandData[1]);
                    numbers.add(addNumber);
                    break;
                case("Remove"):
                    int numberToRemove=Integer.parseInt(commandData[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case("RemoveAt"):
                    int index=Integer.parseInt(commandData[1]);
                    numbers.remove(index);
                    break;
                case("Insert"):
                    int numberToAdd=Integer.parseInt(commandData[1]);
                    int indexInsert=Integer.parseInt(commandData[2]);
                    numbers.add(indexInsert,numberToAdd);
                    break;
            }

            command=scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
