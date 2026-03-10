public class WarehouseAnalysis{
    public static void main(String[] args){
        double[] boxWeight = {12.5, 55.0,45.0,18.0,22.5,60.0,30.0,15.0,50.0,10.0};
        int heavyCount = 0;
        int mediumCount = 0;
        int lightCount = 0;
        int i = 0;
        double maxWeight= 0;
        double totalWeight = 0;
        double averageWeight = 0;
        
        for(i = 0; i<boxWeight.length; i++){
            if(boxWeight[i]>50){
                heavyCount++;
                System.out.println("Box"+ (i+1)+": "+ boxWeight[i] + "(heavy "+ heavyCount +")");
            }else if(boxWeight[i]>=20 && boxWeight[i]<=50){
                mediumCount++;
                System.out.println("Box"+ (i+1)+": "+ boxWeight[i] + "(medium "+ mediumCount +")");
            }else{
                lightCount++;
                System.out.println("Box"+ (i+1)+": "+ boxWeight[i] + "(light "+ lightCount +")");
            }

            if(maxWeight < boxWeight[i]){
                maxWeight = boxWeight[i];
            }
            totalWeight += boxWeight[i];
            averageWeight = totalWeight/(i+1);
        }
        System.out.println();
        System.out.println("Box"+ (i+1)+": "+ maxWeight + "(HEAVIEST BOX!)");
        System.out.println("The total weight of the boxes: "+ totalWeight+ "kg");
        System.out.println("The average weight of the boxes: "+ averageWeight+ "kg");
    }
}