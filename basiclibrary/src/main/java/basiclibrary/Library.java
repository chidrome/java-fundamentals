/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;

public class Library {

    // generate a random number from 1 - 6 and enter it into an array n number of times
    public static int[] roll(int numberOfTimesToRoll){
        int[] rolledNumbers = new int[numberOfTimesToRoll];

        for(int i = 0; i < numberOfTimesToRoll; i++){
            rolledNumbers[i] = (int) (Math.random()*6) + 1;
        }

        return rolledNumbers;
    }

    // check to see if an array contains duplicate values
    public static boolean containsDuplicates(int[] inputArray){

        // sort the array first
        Arrays.sort(inputArray);

        // declare the previous value to check against
        int previousValue = inputArray[0];

        // loop through the array and check to see if there is a duplicate
        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] == previousValue) {
                return true;
            }
            previousValue = inputArray[i];
        }

        return false;
    }

    // calculate the average of the array
    public static double getAverage(int[] inputArray) {
        double sum = 0.0;

        // loop through the array and add
        for (int element: inputArray) {
            sum = sum + element;
        }
        double average = sum / inputArray.length;
        return average;
    }

    // calculate the averages of each array and return the lowest
    public static int lowestAvg(int[][] inputArray){
        // specify an array with the averages
        double[] avgsArray = new double[inputArray.length];
        // index array average
        double sumOfCurrentArray = 0.0;

        // loop through the array of arrays
        for(int i = 0; i < inputArray.length; i++){
            // loop through the arrays in that index
            for(int j = 0; j < inputArray[i].length; j++){
                sumOfCurrentArray += inputArray[i][j];
            }
            avgsArray[i] = sumOfCurrentArray / inputArray[i].length;
            sumOfCurrentArray = 0.0;
        }
        Arrays.sort(avgsArray);
        double lowestAverage = avgsArray[0];
    }

}