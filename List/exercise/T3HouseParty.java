package List.exercise;

import java.util.*;

public class T3HouseParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=Integer.parseInt(scanner.nextLine());
        List<String> guesst= new ArrayList<>();
        for (int i = 0; i <count ; i++) {
            String command=scanner.nextLine();
            String[] commandData=command.split(" ");
            String nameGuesst=commandData[0];
            int countName=0;
            if(commandData.length<=3){
                guesst.add(0, nameGuesst);
            }
            else {
                for (int index = 0; index <guesst.size() ; index++) {
                    String current=guesst.get(index);
                    if(current.equals(nameGuesst)){
                        countName++;
                        guesst.remove(index);
                    }

                }
                if(countName==0){
                    System.out.printf("%s is not in the list!\n",nameGuesst);
                }



            }
            for (int index = 0; index <guesst.size() ; index++) {
                String current=guesst.get(index);
                if(current.equals(nameGuesst)) {
                    countName++;

                    if (countName > 1) {
                        System.out.printf("%s is already in the list!\n", nameGuesst);
                        guesst.remove(0);
                        index--;
                    }
                }
            }

        }

        Collections.reverse(guesst);
        for (String guess:guesst) {
            System.out.println(guess);
        }

    }
}
