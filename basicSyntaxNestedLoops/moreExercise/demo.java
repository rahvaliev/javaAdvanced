package basicSyntaxNestedLoops.moreExercise;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String cod=scanner.nextLine();
        int num=Integer.parseInt(cod.charAt(0)+"");
        int num2=((char)cod.charAt(0));
        System.out.println(num);
        System.out.println(num2);
        int total=2+num;
        System.out.println(total);
    }
}
