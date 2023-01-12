package Methods.lab;

import java.util.Scanner;

public class T9GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String type=scanner.nextLine();
        switch (type){
            case ("int"):
                int num1=Integer.parseInt(scanner.nextLine());
                int num2=Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1,num2));
                break;
            case ("char"):
                char first=scanner.nextLine().charAt(0);
                char second=scanner.nextLine().charAt(0);
                char result=(char)getMax(first,second);
                System.out.println(result);
                break;
            case("string"):
                String firstS=scanner.nextLine();
                String secondS=scanner.nextLine();
                System.out.println(getMax(firstS,secondS));
                break;
        }
    }

    private static String getMax(String firstS, String secondS) {
        if(firstS.compareTo(secondS)>0){
            return firstS;
        }else {
            return secondS;
        }
    }

    private static int getMax(int num1, int num2) {
        if(num1>num2){
            return num1;
        }else {
            return num2;
        }
    }
}
