package Methods.lab;

import java.util.Scanner;

public class T4Calculation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String comand=scanner.nextLine();
        int a=Integer.parseInt(scanner.nextLine());
        int b=Integer.parseInt(scanner.nextLine());
        switch (comand){
            case "add":
                add(a,b);
                break;
            case "subtract":
                subtract(a,b);
                break;
            case "multiply":
                multiply(a,b);
                break;
            case "divide":
                divide(a,b);
                break;
        }
    }

    private static void divide(int a, int b) {
        System.out.println(a/b);
    }

    private static void multiply(int a, int b) {
        System.out.println(a*b);
    }

    private static void subtract(int a, int b) {
        System.out.println(a-b);
    }

    private static void add(int a, int b) {
        System.out.println(a+b);
    }
}
