package List.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T5ListManipulationAdvance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String command=scanner.nextLine();
        while (!command.equals("end")){
            String[] commandData=command.split(" ");
            /*
            Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
Print even – print all the numbers that are even separated by a space
Print odd – print all the numbers that are odd separated by a space
Get sum – print the sum of all the numbers
Filter ({condition} {number}) – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="
             */
            switch (commandData[0]){
                case("Contains"):
                    int numberContains=Integer.parseInt(commandData[1]);
                    if(numbers.contains(Integer.valueOf(numberContains))){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                    break;
                case ("Print"):
                    String evenOrOdd=commandData[1];
                    if(evenOrOdd.equals("even")){
                        List<Integer> evenList=new ArrayList<>();
                        for (int i = 0; i <numbers.size() ; i++) {
                        int currentNumber=numbers.get(i);
                        if(currentNumber%2==0){
                            evenList.add(currentNumber);
                        }
                        }
                        System.out.println(evenList.toString().replaceAll("[\\[\\],]",""));

                    }else if(evenOrOdd.equals("odd")){
                        List<Integer> oddList=new ArrayList<>();
                        for (int i = 0; i <numbers.size() ; i++) {
                            int currentNumber=numbers.get(i);
                            if(currentNumber%2!=0){
                                oddList.add(currentNumber);
                            }
                        }
                        System.out.println(oddList.toString().replaceAll("[\\[\\],]",""));

                    }
                    break;
                case("Get"):
                    int sum=0;
                    for (int i = 0; i <numbers.size() ; i++) {
                        sum+=numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case("Filter"):
                    String condition=commandData[1];
                    int numberFilter=Integer.parseInt(commandData[2]);
                    List<Integer>listFilter=new ArrayList<>();
                    if(condition.equals(">")){
                        for (int i = 0; i <numbers.size() ; i++) {
                            if(numberFilter<numbers.get(i)){
                                listFilter.add(numbers.get(i));
                            }
                        }

                    }else if(condition.equals("<")){
                        for (int i = 0; i <numbers.size() ; i++) {
                            if(numberFilter>numbers.get(i)){
                                listFilter.add(numbers.get(i));
                            }
                        }

                    }else if(condition.equals(">=")){
                        for (int i = 0; i <numbers.size() ; i++) {
                            if(numberFilter<=numbers.get(i)){
                                listFilter.add(numbers.get(i));
                            }
                        }

                    }else if(condition.equals("<=")){
                        for (int i = 0; i <numbers.size() ; i++) {
                            if(numberFilter>=numbers.get(i)){
                                listFilter.add(numbers.get(i));
                            }
                        }

                    }
                    System.out.println(listFilter.toString().replaceAll("[\\[\\],]",""));
                    break;
            }
            command=scanner.nextLine();
        }
    }




}
