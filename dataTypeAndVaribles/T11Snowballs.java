package dataTypeAndVaribles;

import java.util.Scanner;

public class T11Snowballs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        double max=0;
        //{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})
        int maxSnow=0;
        int maxTime=0;
        int maxQuality=0;
        for (int i = 0; i <n ; i++) {
            /*
                • On the first line you will get the snowballSnow – an integer.
    • On the second line you will get the snowballTime – an integer.
    • On the third line you will get the snowballQuality – an integer.
             */
            int snowballSnow=Integer.parseInt(scanner.nextLine());
            int snowballTime=Integer.parseInt(scanner.nextLine());
            int snowballQuality=Integer.parseInt(scanner.nextLine());
            //
            //int snowballValue=(snowballSnow/snowballTime);
            double snowballValue=Math.pow((snowballSnow/snowballTime),snowballQuality);



                if (max < snowballValue) {
                    maxSnow = snowballSnow;
                    maxTime = snowballTime;
                    maxQuality = snowballQuality;
                    max = snowballValue;


                }



        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnow,maxTime,max,maxQuality);

    }
}
