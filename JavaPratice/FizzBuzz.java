import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        System.out.println("A FizzBuzz Game");

        //Read input
        Scanner sc = new Scanner(System.in);
        
        //Variable declaration
        int number = 0;
        boolean valid = false;
        
        //Checks to see if user inputs an integer using while loop
        while (!valid){
        try {
                System.out.print("Number: ");
                String input = sc.nextLine();
                number = Integer.parseInt(input); // try to convert
                valid = true;
            } 
                catch (NumberFormatException e) {
                System.out.println("That was not an integer. Try again.");
            }
        }  
        //Conditions for FizzBuzz  
        if (number%3 == 0 && number%5 ==0){
            System.out.println("FizzBuzz");//divisible by both 3 and 5, displays FizzBuzz
        }
        else if (number % 3 == 0 ){
            System.out.println( "Buzz");//divisible by 3, displays 3
        }
        else if(number % 5 == 0){
            System.out.println("fizz");// divisile by 5, displays 5
        }
        else {
            System.out.println(number);// when not divisible by either 3 or 5, returns the dsame number
        }
        sc.close();

    }
}
