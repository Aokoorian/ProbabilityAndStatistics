import java.util.*;
public class StatsLibrary
{
    public static double calculateMean(double mean[])
    {
        double sum = 0;
        for(int i = 0; i < mean.length; i++)
        {
            sum+= mean[i];
        }
        return sum / mean.length;
    }
    
     public static double calculateMedian(double[] numbers) {
        Arrays.sort(numbers);
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            return (numbers[middle - 1] + numbers[middle]) / 2.0;
        } else {
            return numbers[middle];
        }
    }
    
    public static double calculateStandardDeviation(double[] numbers) {
        double mean = calculateMean(numbers);
        double sumSquaredDifferences = 0.0;

        for (double num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        double variance = sumSquaredDifferences / numbers.length;
        return Math.sqrt(variance);
    }
    
    public static double calculateVariance(double[] numbers){
        double mean = calculateMean(numbers);
        double sumSquaredDifferences = 0.0;

        for (double num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        double variance = sumSquaredDifferences / numbers.length;
        return variance;
    }
}