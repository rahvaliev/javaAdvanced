package List.more;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T5DrumSet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double savings=Double.parseDouble(scanner.nextLine());
        String initial=scanner.nextLine();
        List<Integer> drumSet= Arrays.stream(initial.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> initialList=Arrays.stream(initial.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String comman= scanner.nextLine();
        while (!comman.equals("Hit it again, Gabsy!")){
            int hitPower=Integer.parseInt(comman);
            for (int i = 0; i < drumSet.size() ; i++) {
                drumSet.set(i,drumSet.get(i)-hitPower);
            }
            for (int i = 0; i < drumSet.size() ; i++) {
                if(drumSet.get(i)<=0){
                    int replacementSum=initialList.get(i)*3;
                    if(replacementSum<=savings){
                        savings-=replacementSum;
                        drumSet.set(i,initialList.get(i));
                    }else {
                        drumSet.remove(i);
                        initialList.remove(i);
                        i=-1;
                    }
                }
            }



            comman=scanner.nextLine();
        }
        for (int drum:drumSet) {
            System.out.print(drum+" ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.",savings);
    }
}
