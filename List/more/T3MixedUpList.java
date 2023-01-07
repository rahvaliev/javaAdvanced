package List.more;

import java.util.*;
import java.util.stream.Collectors;

public class T3MixedUpList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numbers1= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbers2= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> result=new ArrayList<>();
        List<Integer> bordetResult=new ArrayList<>();
        if(numbers1.size()<numbers2.size()){
            for (int i = 0; i <numbers1.size(); i++) {
                result.add(numbers1.get(i));
                numbers1.remove(0);
                result.add(numbers2.get(numbers2.size()-1-i));
                numbers2.remove(numbers2.size()-1);
                i=-1;
            }
            int start=Math.min(numbers2.get(0),numbers2.get(1));
            int end=Math.max(numbers2.get(0),numbers2.get(1));
            for (int index = 0; index <result.size() ; index++) {
                int current=result.get(index);
                if(current>start && current<end){
                    bordetResult.add(current);
                }
            }
            Collections.sort(bordetResult);
            for (int number:bordetResult) {
                System.out.print(number+" ");

            }
        }else {
            for (int i = 0; i <numbers2.size(); i++) {
                result.add(numbers1.get(i));
                numbers1.remove(0);
                result.add(numbers2.get(numbers2.size()-1-i));
                numbers2.remove(numbers2.size()-1);
                i=-1;
            }
            int start=Math.min(numbers1.get(0),numbers1.get(1));
            int end=Math.max(numbers1.get(0),numbers1.get(1));
            for (int index = 0; index <result.size() ; index++) {
                int current=result.get(index);
                if(current>start && current<end){
                    bordetResult.add(current);
                }
            }
            Collections.sort(bordetResult);
            for (int number:bordetResult) {
                System.out.print(number+" ");

            }


        }

    }
}
