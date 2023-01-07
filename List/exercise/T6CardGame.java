package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T6CardGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> firstPlayer= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            int firstCard=firstPlayer.get(0);
            int secondCard=secondPlayer.get(0);

            if(firstCard==secondCard){
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }else if(firstCard>secondCard){
                secondPlayer.remove(0);
                firstPlayer.remove(0);
                firstPlayer.add(firstCard);
                firstPlayer.add(secondCard);
            }else if(secondCard>firstCard){
                secondPlayer.remove(0);
                firstPlayer.remove(0);
                secondPlayer.add(secondCard);
                secondPlayer.add(firstCard);

            }
        }
        int sum=0;
        String player="";
        if(secondPlayer.isEmpty()){
            for (int i = 0; i < firstPlayer.size() ; i++) {
               sum+=firstPlayer.get(i);
               player="First";
            }
        }else {
            for (int i = 0; i < secondPlayer.size() ; i++) {
                sum+=secondPlayer.get(i);
                player="Second";
            }
        }
        System.out.printf("%s player wins! Sum: %d",player,sum);
    }
}
