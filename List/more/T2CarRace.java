package List.more;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T2CarRace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> times= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Double timeLeftRacer=0.0;
        Double timeRightRacer=0.0;
        int midle=times.size()/2;
        for (int leftIndex = 0; leftIndex <midle ; leftIndex++) {
            if(times.get(leftIndex)==0){
                timeLeftRacer*=0.8;
            }else {
                timeLeftRacer+=times.get(leftIndex);
            }

        }
        for (int rightIndex = times.size()-1; rightIndex >midle ; rightIndex--) {
            if(times.get(rightIndex)==0){
                timeRightRacer*=0.8;
            }else {
                timeRightRacer+=times.get(rightIndex);
            }

        }
        if(timeLeftRacer<timeRightRacer){
            System.out.printf("The winner is left with total time: %.1f",timeLeftRacer);
        }else {
            System.out.printf("The winner is right with total time: %.1f",timeRightRacer);
        }
    }
}
