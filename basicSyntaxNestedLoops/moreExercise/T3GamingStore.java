package basicSyntaxNestedLoops.moreExercise;

import java.util.Scanner;

public class T3GamingStore {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        String game=scanner.nextLine();
        double gamePrice=0.0;
        double totalSpend=0;
        while (!game.equals("Game Time")){
            if(budget==0){
                System.out.println("Out of money!");
                return;
            }
            switch (game){
                case("OutFall 4"):
                    gamePrice=39.99;
                    if(gamePrice<=budget){
                        budget-=gamePrice;
                        totalSpend+=gamePrice;
                        System.out.printf("Bought %s\n",game);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case("CS: OG"):
                    gamePrice=15.99;
                    if(gamePrice<=budget){
                        budget-=gamePrice;
                        totalSpend+=gamePrice;
                        System.out.printf("Bought %s\n",game);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case("Zplinter Zell"):
                    gamePrice=19.99;
                    if(gamePrice<=budget){
                        budget-=gamePrice;
                        totalSpend+=gamePrice;
                        System.out.printf("Bought %s\n",game);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case("Honored 2"):
                    gamePrice=59.99;
                    if(gamePrice<=budget){
                        budget-=gamePrice;
                        totalSpend+=gamePrice;
                        System.out.printf("Bought %s\n",game);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case("RoverWatch"):
                    gamePrice=29.99;
                    if(gamePrice<=budget){
                        budget-=gamePrice;
                        totalSpend+=gamePrice;
                        System.out.printf("Bought %s\n",game);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case("RoverWatch Origins Edition"):
                    gamePrice=39.99;
                    if(gamePrice<=budget){
                        budget-=gamePrice;
                        totalSpend+=gamePrice;
                        System.out.printf("Bought %s\n",game);
                    }else {
                        System.out.println("Too Expensive");
                    }
                    break;

                default:
                    System.out.println("Not Found");
            }
            if(budget==0){
                System.out.println("Out of money!");
                return;
            }


            game=scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",totalSpend,budget);
    }
}
