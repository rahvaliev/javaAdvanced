package List.more;

import java.util.*;
import java.util.stream.Collectors;

public class T3TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> encripted= Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
        List<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < encripted.size() ; i++) {
         //   System.out.println( Character.isDigit((char)encripted.get(i)));
            String current= encripted.get(i);
            switch (current){
                case("0"):
                case("1"):
                case("2"):
                case("3"):
                case("4"):
                case("5"):
                case("6"):
                case("7"):
                case("8"):
                case("9"):
                    numbers.add(Integer.parseInt(current));
                    encripted.remove(i);
                    i=0;
                    break;
            }
        }

        List<Integer> takeList= new ArrayList<>();
        List<Integer> skipList= new ArrayList<>();
        for (int j = 0; j < numbers.size() ; j++) {
            int digit=numbers.get(j);
            if(j%2==0){
                takeList.add(numbers.get(j));
            }else {
                skipList.add(numbers.get(j));
            }
        }
        String result="";
        for (int i = 0; i < skipList.size() ; i++) {
            for (int j = 0; j < encripted.size() ; j++) {
                for (int k = 0; k <takeList.get(i) ; k++) {
                    result+=encripted.get(0);
                    encripted.remove(0);
                    if(encripted.size()==0){
                        break;
                    }


                }
                for (int k = 0; k <skipList.get(i); k++) {
                    if(encripted.size()==0){
                        break;
                    }
                    encripted.remove(0);


                }
                break;
            }

        }
        System.out.println(result);



    }
}
