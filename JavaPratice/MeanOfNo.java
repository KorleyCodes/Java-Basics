import java.lang.*;
public class MeanOfNo{
    public static void main(String[] args){
        //Finding some of the first ten integers(1 to 10)
        int sumOfIntegers = 0;
        for (int i =1; i<11; i++){
            sumOfIntegers = sumOfIntegers + i;
            }
        System.out.println("The sum of the first ten integers is " + sumOfIntegers);
        
        //finding the mean of the first Ten integers
        double meanOfNo = (double) (sumOfIntegers/10);
        System.out.println("The mean of the first ten Integers is " + meanOfNo);
         
        //finding the variance sum to be used for the standard deviation formula
        double varianceSum = 0;
        for (int j = 1; j<11; j++){
              varianceSum += Math.pow((j - meanOfNo),2);
        }

        //finding the standard deviation
        double standardDeviation = Math.round(Math.sqrt(varianceSum/10)*10000.0)/10000.0;
        System.out.println("The standard deviation of the first integers is " + standardDeviation);
        
        //finding the factorial of the Standard Deviation
        long factorial = 1;
        for (int k= (int)Math.round(standardDeviation); k>=1; k--){
            factorial=factorial*(k);
        }
        System.out.println("The factorial of the Standard Deviation is "+factorial);
    }

}