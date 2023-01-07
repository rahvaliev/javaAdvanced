package List.more;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T1Mesages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
     //   List<Integer> numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> numbersText=Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input=scanner.nextLine();
        List<String> inputData=Arrays.stream(input.split("")).collect(Collectors.toList());
        String result="";

        for (int i = 0; i < numbersText.size() ; i++) {
            String current=numbersText.get(i);
            List<Integer> numbers=Arrays.stream(current.split("")).map(Integer::parseInt).collect(Collectors.toList());
            int sum=0;
            for (int index = 0; index < numbers.size() ; index++) {
                sum+=numbers.get(index);
            }
            for (int inputIndex = 0; inputIndex <inputData.size() ; inputIndex++) {

                if (sum== inputIndex) {
                    result += inputData.get(inputIndex);
                    inputData.remove(inputIndex);
                    break;
                }
                if (inputIndex == inputData.size() - 1) {
                    sum -= inputData.size();
                    inputIndex = -1;
                }

            }

        }
            System.out.println(result);



    }
}
