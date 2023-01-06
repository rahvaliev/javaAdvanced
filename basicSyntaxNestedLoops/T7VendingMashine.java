package basicSyntaxNestedLoops;

import java.util.Scanner;

public class T7VendingMashine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String comand=scanner.nextLine();
        int budget=0;
       while (!comand.equals("Start")){
            double coins=Double.parseDouble(comand);
           if(coins==0.1){
               budget+=10;
           }else if(coins==0.2){
               budget+=20;
           }else if(coins==0.5){
               budget+=50;
           }else if(coins==1){
               budget+=100;
           }else if(coins==2){
               budget+=200;
           }else {
               System.out.printf("Cannot accept %.2f\n",coins);
           }

            comand=scanner.nextLine();
        }
       String product=scanner.nextLine();
       int priceProduct=0;
       while (!product.equals("End")){
           switch (product){
               case ("Nuts"):
                   priceProduct=200;
                   if(priceProduct>budget){
                       System.out.println("Sorry, not enough money");
                   }else {
                       budget-=priceProduct;
                       System.out.printf("Purchased %s\n",product);
                   }
                   break;
               case ("Water"):
                   priceProduct=70;
                   if(priceProduct>budget){
                       System.out.println("Sorry, not enough money");
                   }else {
                       budget-=priceProduct;
                       System.out.printf("Purchased %s\n",product);
                   }
                   break;
               case ("Crisps"):
                   priceProduct=150;
                   if(priceProduct>budget){
                       System.out.println("Sorry, not enough money\n");
                   }else {
                       budget-=priceProduct;
                       System.out.printf("Purchased %s\n",product);
                   }
                   break;
               case ("Soda"):
                   priceProduct=80;
                   if(priceProduct>budget){
                       System.out.println("Sorry, not enough money\n");
                   }else {
                       budget-=priceProduct;
                       System.out.printf("Purchased %s\n",product);
                   }
                   break;
               case ("Coke"):
                   priceProduct=100;
                   if(priceProduct>budget){
                       System.out.println("Sorry, not enough money\n");
                   }else {
                       budget-=priceProduct;
                       System.out.printf("Purchased %s\n",product);
                   }
                   break;
               default:
                   System.out.printf("Invalid product\n");
           }



           product=scanner.nextLine();
       }
        System.out.printf("Change: %.2f\n",budget*0.01);

    }
}
