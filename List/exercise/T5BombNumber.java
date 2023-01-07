package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T5BombNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] bomb=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e ->Integer.parseInt(e) ).toArray();
        int bombNumber=bomb[0];
        int bombPower=bomb[1];
        for (int index = 0; index <numbers.size() ; index++) {
            if(numbers.get(index)==bombNumber){
                for (int i = 1; i <=bombPower ; i++) {
                    if(index+i>numbers.size()-1){
                        break;
                    }else {
                        numbers.remove(index+i);
                    }

                }
                for (int i = 1; i <=bombPower ; i++) {
                    if(index-1<0){
                        break;
                    }else {
                        numbers.remove(index-1);
                        index--;

                    }

                }
                numbers.remove(index);
            }

        }

       int sum=0;
        for (int i = 0; i <numbers.size() ; i++) {
            sum+=numbers.get(i);
        }
        System.out.println(sum);
    }
}
