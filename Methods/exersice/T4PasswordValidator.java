package Methods.exersice;

import java.util.Scanner;

public class T4PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();
        isValidLenght(password);
        if(!isValidLenght(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        consistOnlyLettersAndDigits(password);
        if(!consistOnlyLettersAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        isValidCountDigits(password);
        if(!isValidCountDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }
        if(isValidLenght(password)&& isValidCountDigits(password)&& consistOnlyLettersAndDigits(password)){
            System.out.println("Password is valid\n");
        }
    }

    private static boolean consistOnlyLettersAndDigits(String password) {
        for (int index = 0; index < password.length(); index++) {
            char currentSymbol=password.charAt(index);
            if (!Character.isLetterOrDigit(currentSymbol)){
                return false;
            }

        }
        return  true;

    }

    private static boolean isValidLenght(String password) {
        return(password.length()>=6 && password.length()<=10);

    }

    private static boolean isValidCountDigits(String password){
        int countDigit=0;
        for (int index = 0; index <password.length() ; index++) {
            char currenSymbol=password.charAt(index);
            if(Character.isDigit(currenSymbol)){
                countDigit++;
            }

        }
        return (countDigit>=2);

    }
}
