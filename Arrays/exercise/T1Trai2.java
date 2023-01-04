package Arrays.exercise;

import java.util.Scanner;

public class T1Trai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int peopleInWagon []=new int[n];
        for (int index = 0; index <peopleInWagon.length ; index++) {
            peopleInWagon[index]=Integer.parseInt(scanner.nextLine());
        }
        int sum=0;
        for (int countPeople : peopleInWagon) {
            System.out.print(countPeople +" ");
            sum+=countPeople;

            
        }
        System.out.println();
        System.out.println(sum);
        
            
        
    }
}
