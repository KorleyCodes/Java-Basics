public class FuelConsumptionAnalysis{
    public static void main(String[] args){
        double [] fuelConsumption = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};
        
        int i =0;
        int highCount = 0;
        int normalCount = 0;
        int lowCount = 0;
        double totalFuelConsumption = 0;
        double averageFuelConsumption = 0;
        double maxConsumption = fuelConsumption[i];
        int maxday = 0;
        
        while ((i < fuelConsumption.length)){
            if (maxConsumption < fuelConsumption[i]){
                maxConsumption = fuelConsumption[i];
                maxday = i;
            }
            if (fuelConsumption[i] >20){
                highCount++;
                System.out.println("Day"+(i+1)+ ": " + String.format("%.2f",fuelConsumption[i]) +" litres"+ " (High "+(highCount)+")");
            }
            else if(fuelConsumption[i]>=10 && fuelConsumption[i]<=20){
                normalCount++;
                System.out.println("Day"+(i+1)+ ": " + String.format("%.2f",fuelConsumption[i]) +" litres"+ " (Normal "+(normalCount)+")");
            }
            else{
                lowCount++;
                System.out.println("Day"+(i+1)+ ": " + (String.format("%.2f",fuelConsumption[i])) +" litres"+ " (Low "+(lowCount)+")");
            }
            totalFuelConsumption += fuelConsumption[i];
            averageFuelConsumption = totalFuelConsumption/(fuelConsumption.length);
            i++;
        }
        System.out.println();
        System.out.println("Day"+(maxday+1)+ ":" +String.format("%.2f",fuelConsumption[maxday]) + " (Max Fuel Consumption Day)");
        System.out.println("The total fuel consumption: "+String.format("%.2f",totalFuelConsumption) + " litres");
        System.out.println("The average fuel consumption: "+String.format("%.2f",averageFuelConsumption) +" litres");
    }
} 