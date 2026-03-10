import java.util.Scanner;

public class CinemaTicketBooking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean validInput = false;
        int oneCount= 0;
        int twoCount = 0;
        int threeCount= 0;
        do{
            System.out.println(" Option 1 (Regular): ₵25.00");
            System.out.println(" Option 2 (Student): ₵15.00");
            System.out.println(" Option 3 (VIP): ₵50.00");
            System.out.println(" Option 4: Finish booking");
            System.out.print("Enter Option number:");
            validInput = (input>= 1 && input<= 4);
            try{
                input = sc.nextInt();
                validInput = (input>= 1 && input<= 4);
                if(validInput){
                System.out.println("option"+ input);
                }
                else{
                    System.out.println("Invalid option");
                }
            }
            catch(Exception e){
                System.out.println("Invalid option");
                sc.nextLine();
            }
            if (input ==1){
                oneCount++;
            }
            else if(input ==2){
                twoCount++;
            }
            else{
                threeCount++;
            }
        }while(!(input == 4));

        System.out.println(oneCount);
        System.out.println(twoCount);
        System.out.println(threeCount);
        
        int totalCount = oneCount+twoCount+threeCount;
        if(totalCount == 0){
            System.out.println("No tickets booked");
        }
        else if(totalCount>=1 && totalCount<=3){
            System.out.println("Standard booking");
        }
        else{
            System.out.println("Group booking");
        }
        System.out.println("The total ticket count: "+ totalCount);
        System.out.println("Total amount: GH₵" +String.format("%.2f",((oneCount*25.00)+(twoCount*15.00)+(threeCount*50.00))));
        
        sc.close();
    }
}