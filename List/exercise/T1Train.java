package List.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T1Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> wagons= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacyti=Integer.parseInt(scanner.nextLine());
        String comand=scanner.nextLine();
        while (!comand.equals("end")){
            String[] comandData=comand.split(" ");
            if(comandData[0].equals("Add")){
                int passengers=Integer.parseInt(comandData[1]);
                wagons.add(passengers);
            }else {
                int passangerToAdd=Integer.parseInt(comandData[0]);
                for (int index = 0; index <wagons.size() ; index++) {

                    if(wagons.get(index)+passangerToAdd<=maxCapacyti){
                        wagons.set(index,wagons.get(index)+passangerToAdd);
                        break;
                    }

                }

            }






            comand=scanner.nextLine();
        }

        for (int wagon:wagons) {
            System.out.print(wagon+" ");
        }
    }
}
