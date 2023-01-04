package Arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ladyBugs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sizeField=Integer.parseInt(scanner.nextLine());
        String initialPosition=scanner.nextLine();
        int [] initialLadyBugs= Arrays.stream(initialPosition.split(" ")).mapToInt(e ->Integer.parseInt(e) ).toArray();
        int[]ladyBugs=new int [sizeField];
        for (int i = 0; i <initialLadyBugs.length ; i++) {
            if(initialLadyBugs[i]>=0 && initialLadyBugs[i]<ladyBugs.length){
                ladyBugs[initialLadyBugs[i]]=1;
            }
        }
        String command=scanner.nextLine();
        while (!command.equals("end")){
            String[]commandData=command.split(" ");
            int ladyBugsIndex=Integer.parseInt(commandData[0]);
            String direction=commandData[1];
            int flyLenght=Integer.parseInt(commandData[2]);
            if(ladyBugsIndex>=0 && ladyBugsIndex<ladyBugs.length){


            switch (direction){
                case("right"):
                    if(ladyBugs[ladyBugsIndex]==1){

                            for (int i = ladyBugsIndex; i <ladyBugs.length ; i+=flyLenght) {
                                if((i+flyLenght)>=0 && (i+flyLenght<ladyBugs.length)){
                                    if(ladyBugs[i+flyLenght]==0){
                                        ladyBugs[i+flyLenght]=1;
                                        break;
                                    }
                                }


                            }
                            ladyBugs[ladyBugsIndex]=0;

                    }

                    break;
                case("left"):
                    if(ladyBugs[ladyBugsIndex]==1){
                        for (int leftIndex = ladyBugsIndex; leftIndex >=0 ; leftIndex-=flyLenght) {
                            if((leftIndex-flyLenght)>=0 && (leftIndex-flyLenght<ladyBugs.length)){
                                if(ladyBugs[leftIndex-flyLenght]==0){
                                    ladyBugs[leftIndex-flyLenght]=1;
                                    break;
                                }
                            }

                        }



                        ladyBugs[ladyBugsIndex]=0;
                    }
                    
                    break;
            }
            }


            command=scanner.nextLine();
        }
        for (int bugs:ladyBugs) {
            System.out.print(bugs+" ");
        }
    }
}
