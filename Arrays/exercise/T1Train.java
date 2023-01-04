package Arrays.exercise;

import java.util.Scanner;

public class T1Train {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int peopleInWagon []= new int[n];
        int sum=0;

        for (int index = 0; index < peopleInWagon.length ; index++) {
            peopleInWagon[index]=Integer.parseInt(scanner.nextLine());
            System.out.print(peopleInWagon[index]+" ");
            sum+=peopleInWagon[index];

        }
        System.out.println();
        System.out.println(sum);

    }

}
