import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args){
            final double COST_PER_KWH = 0.20;
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter total number of devices: ");
            int n = sc.nextInt();
            System.out.println();

            double baseCost = 0;
            double totalCost = 0;
            double totalConsumption = 0;
            
            for(int i = 0; i<n; i++){
                System.out.print("Enter Consumption for appliance (KWH)" + (i+1)+": ");
                double consumption= sc.nextDouble();

                if(consumption >100){
                    baseCost =consumption*COST_PER_KWH*1.15;
                    System.out.println("Cost= GH₵" +  String.format("%.2f",baseCost) +" (a surcharge was applied).");
                }
                else{
                    baseCost = consumption *COST_PER_KWH;
                    System.out.println("Cost= GH₵" +  String.format("%.2f",baseCost));
                }
                System.out.println();
                totalCost += baseCost;
                totalConsumption += consumption;
            }
            
            System.out.println();
            System.out.println("Total consumption: " + totalConsumption +"KWH");
            System.out.println("Total Cost of consumption: GH₵" + String.format("%.2f",totalCost));

            sc.close();
    }
}