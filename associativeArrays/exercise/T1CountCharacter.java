package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class T1CountCharacter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //{char} -> {occurrences}
        String[] inputData=scanner.nextLine().split("\\s+");
        Map<Character,Integer> count=new LinkedHashMap<>();
        for (int i = 0; i < inputData.length ; i++) {
            for (int j = 0; j <inputData[i].length() ; j++) {
            char symbol=inputData[i].charAt(j);
            count.putIfAbsent(symbol,0);
            count.put(symbol,count.get(symbol)+1);
            }
        }
        count.forEach((k,v)-> System.out.printf("%s -> %d%n",k,v));
    }
}
