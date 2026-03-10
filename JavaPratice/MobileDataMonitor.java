import java.util.Scanner;

public class MobileDataMonitor {
    public static void main(String[] args){
        double totalData=0;
        double dataBalance = 20;
        double input;


        Scanner sc = new Scanner(System.in);

        while (dataBalance>0) {
            if (dataBalance <= 0.0001) {
                System.out.println("Data exhausted. Internet disconnected");
                break;
            }
            
            System.out.print("Enter data used in current session: ");
            input = sc.nextDouble();

            // Negative input check
            if (input < 0) {
                System.out.println("Invalid input");
                continue;
            }

            // Zero input check
            if (input == 0) {
                System.out.println("No data used this session.");
                continue;
            }

            // Overspending check
            if (input > dataBalance) {
                System.out.println("Error: You cannot use more than your remaining balance (" 
                           + String.format("%.2f", dataBalance) + " GB).");
                continue;
            }

            // Apply usage
            totalData += input;
            dataBalance -= input;

            
            if (dataBalance <= 0.0001) {
                System.out.println("Data exhausted. Internet disconnected");
                break;
            }
            // Status alerts ONLY if balance still positive
            if (dataBalance > 5.0) {
                System.out.println("Data balance is sufficient");
            } else if (dataBalance > 1.0) {
                System.out.println("Warning: Data balance is low");
            } else { // balance between 0 and 1
                System.out.println("Critical: Data almost exhausted");
            }
        }
        System.out.println("You have used "+String.format("%.2f",totalData)+ "GB.");
        System.out.println("You have "+String.format("%.2f", dataBalance)+ "GB left.");

        sc.close();

    }
}
