import java.util.*;
public class KioskSystem {
    public static void main(String[] args) {
        int burgerCount = 0;
        int friesCount = 0;
        double grandTotal;
        int totalItem;
        int input;
        int quantity;
        
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Burger : $5.99");
            System.out.println("2. Fries : $2.50");
            System.out.println("3. Checkout");

            System.out.print("Enter the option number: ");
            input = sc.nextInt();

            if(input < 1 || input >3){
                System.out.println("Invalid input");
                continue;
            }
             if (input ==1 ){
                System.out.print("How many burgers: ");
                quantity = sc.nextInt();
                burgerCount+=quantity;
                System.out.println("Added " + burgerCount + " burgers to cart");
             }else if(input ==2){
                 System.out.print("How many Fries: ");
                quantity = sc.nextInt();
                friesCount+=quantity;
                System.out.println("Added " + friesCount + " fries to cart");
             }else if (input == 3){
                break;
             }

            

        }while(input!=3);

        totalItem=friesCount + burgerCount;
        grandTotal = (friesCount*2.50)+(burgerCount*5.99);

        System.out.println("Total items purchased: "+ totalItem +" Item(s)");
        System.out.println("Final bill: $"+String.format("%.2f", grandTotal));
        sc.close();
    }
}
