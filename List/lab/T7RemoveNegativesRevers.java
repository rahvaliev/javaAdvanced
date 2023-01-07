package List.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T7RemoveNegativesRevers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        for (int index = 0; index <numbers.size() ; index++) {
            if(numbers.get(index)<0){
                numbers.remove(index);
                index--;
            }

        }
        if(numbers.isEmpty()){
            System.out.println("empty");
        }else {


        Collections.reverse(numbers);
        for (int number:numbers
             ) {
            System.out.print(number+" ");
        }
        }
    }
}
