
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


class AppTest {
    App app =new App();

    @Test
    void calculateAverage() {

        int[] arr = {1, 2, 3};
        double testResult = App.calculateAverage(arr);
        assertEquals(2, testResult);
    }

    @Test
    void avgArrOfArr() {
        int[][] arr = {{66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}};
        int[] testResult = App.avgArrOfArr(arr);
        int[] testExpec = {55, 54, 60, 53, 59, 57, 61};
        assertArrayEquals(testExpec, testResult);

    }

    @Test
    void containsDuplicates() {
        int[] arr = {1, 2, 3, 4, 5};
        boolean testResult = App.containsDuplicates(arr);
        assertFalse(testResult);
    }

    @Test
    void roll() {
        boolean test = true;
        int n = 6;
        int[] rollValur = App.roll(n);
        for (int elemnt :
                rollValur) {
            if (elemnt < 0 || elemnt > 6) {
                test = false;
            }
        }
        if (rollValur.length != n) {
            test = false;
        }
        assertTrue(test);
    }
    @Test
    void test1(){
        HashSet result = new HashSet<>();
        HashSet result1 = new HashSet<>();

        String[]resultAc= new  String[6];
        resultAc[0]="Never saw temperature: 63";
        resultAc[1]="Low :51";
        resultAc[2]="High :72";
        resultAc[3]="Never saw temperature: 69";
        resultAc[4]="Never saw temperature: 67";
        resultAc[5]="Never saw temperature: 68";

        result1.addAll(Arrays.asList(resultAc));

        int[][] testArr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        result.addAll(app.AnalyzingWeatherData(testArr));
        assertEquals(result1,result);
    }
    @Test
    void test2(){
        List<String> votes = new ArrayList<>();
        votes.add("hashem");
        votes.add("hashem");
        votes.add("hashem");
        votes.add("hashem");
        votes.add("hashem");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String expected = "hashem" +"  received the most votes!";

        String result = app.tally(votes);

        assertEquals(expected,result);



    }

}