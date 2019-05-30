/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import static basiclibrary.Library.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testRollMethod() {

        int[] inputArrayLength = new int[]{1,2,3,4};

        assertEquals("This should return the same length of an array as the number entered",
                inputArrayLength.length,
                roll(4).length);
    }

    @Test
    public void testContainsDuplicateMethod() {

        int[] inputArray = new int[]{1,2,4,5,2};

        assertTrue("should return true",
                containsDuplicates(inputArray)
        );
    }

    @Test
    public void testAverage(){

        int[] inputArray = new int[]{1,2,3,4,5,6};
        double average = getAverage(inputArray);
        assertTrue("should return average ",average == 3.5);
    }

    @Test
    public void testAverageCalcNestedArray(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        double average = lowestAvg(weeklyMonthTemperatures);
        assertEquals("LowsestAvg is: ",57.0, average, 0.01);

    }

    @Test
    public void testAnalyzeWeatherDataMethod(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        analyzeWeatherData(weeklyMonthTemperatures);
    }
}
