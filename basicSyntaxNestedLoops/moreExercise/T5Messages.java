package basicSyntaxNestedLoops.moreExercise;

import java.util.Scanner;

public class T5Messages {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String messages="";
        int index=0;

        for (int i = 0; i <n ; i++) {
            String cod=scanner.nextLine();
            char mainDigit=cod.charAt(0);
            if(mainDigit==56){
                index = (((mainDigit - 50) * 3) + cod.length() );
            }else if(mainDigit==57){
                index = (((mainDigit - 50) * 3) + cod.length());
            }else if(mainDigit==48){
                index=-65;
            }else {
                index = (((mainDigit - 50) * 3) + cod.length() - 1);
            }
            messages+=((char)(97+index));


        }
        System.out.println(messages);
    }
}
