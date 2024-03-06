import java.util.*;
public class StatsTester
{
    public static void main(String[] args)
    {
        StatsLibrary test = new StatsLibrary();
        double[] numbers = new double[]{1,2,3,4,5,6,7,8,9,10,10};
        double meanResults = test.calculateMean(numbers);
        System.out.println("The Mean is: " + meanResults);
        double medianResults = test.calculateMedian(numbers);
        System.out.println("The Median is: " + medianResults);
        double stdResults = test.calculateStandardDeviation(numbers);
        System.out.println("The Standard Deviation is: " + stdResults);
        double varianceResults = test.calculateVariance(numbers);
        System.out.println("The Variance is: " + varianceResults);      
    }
}
