package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T2ChangeList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command=scanner.nextLine();
        while (!command.equals("end")){
            String[] commandData=command.split(" ");
            String typeOfOperation=commandData[0];
            if(typeOfOperation.equals("Delete")){
                int elements=Integer.parseInt(commandData[1]);
                for (int index = 0; index <numbers.size() ; index++) {
                    int current=numbers.get(index);
                    if(current==elements){
                        numbers.remove(index);
                        index--;
                    }

                }

            }else if(typeOfOperation.equals("Insert")) {
                int elements=Integer.parseInt(commandData[1]);
                int position=Integer.parseInt(commandData[2]);
                numbers.add(position,elements);

            }
            command=scanner.nextLine();
        }
        for ( int number:numbers) {
            System.out.print(number+" ");

        }

    }
}
