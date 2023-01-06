package dataTypeAndVaribles;

import java.util.Scanner;

public class T10PokeMon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int pokePowerN=Integer.parseInt(scanner.nextLine());
        int halfN=pokePowerN/2;
        int countPokes=0;
        int pokeDistanceM=Integer.parseInt(scanner.nextLine());
        int dividerY=Integer.parseInt(scanner.nextLine());
        while (pokePowerN>=pokeDistanceM){
            pokePowerN-=pokeDistanceM;
            countPokes++;
            if(pokePowerN==halfN){
                if(dividerY!=0){
                    pokePowerN/=dividerY;
                }

            }
        }
        System.out.println(pokePowerN);
        System.out.println(countPokes);
    }
}
