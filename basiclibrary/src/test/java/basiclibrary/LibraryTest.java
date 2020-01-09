/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Float;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

    public static boolean checkRollRange() {
        Library classUnderTest = new Library();
        int[] rollArr = classUnderTest.roll(50);
        boolean numbersAreAllInRange = true;
        for (int num : rollArr) {
            if (num > 6 || num < 1)
                numbersAreAllInRange = false;
        }
        return numbersAreAllInRange;
    }

    @Test public void testRoll() {
        //Happy path:
        assertTrue("roll() values should only be 1-6", checkRollRange());

        //Expected failure:
        assertFalse("roll() should return an array", (!Library.roll(20).getClass().isArray()));
    }

    @Test public void testContainsDuplicates() {
        //Happy paths:
        int[] testArray = {1, 2, 3, 2, 5};
        assertTrue("{1, 2, 3, 2, 5} should return 'true'", Library.containsDuplicates(testArray));
        testArray = new int[] {1, 2, 3};
        assertFalse("{1, 2, 3} should not return true", Library.containsDuplicates(testArray));
    }

    @Test public void testCalculatesAverages() {
        int[] testArray = {1, 23, 55, 4, 5};
        float averageOfTestArray = (float) ((1 + 23 + 55 + 4 + 5) / 5.0);
        boolean actual = (Math.abs(Library.calculatesAverages(testArray) - averageOfTestArray) < 0.1);
        boolean actual2 = (Library.calculatesAverages(testArray) == (int) Library.calculatesAverages(testArray));

        //Happy paths:
        assertTrue("{1, 23, 55, 4, 5} should return float ~17.6", actual);
        assertFalse("calculatesAverages() should not return an int", actual2);
    }
    @Test public void testArrayWithLowestAverage() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        boolean actual = (Library.arrayWithLowestAvg(weeklyMonthTemperatures) == weeklyMonthTemperatures[2]);
        boolean actual2 = (!Library.arrayWithLowestAvg(weeklyMonthTemperatures).getClass().isArray());

        //Happy paths:
        assertTrue("the third array in weeklyMonthTemperatures has the lowest average", actual);
        assertFalse("arrayWithLowestAvg() should not return the average number, just an array", actual2);
    }

    @Test public void testMapTemperatures() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        //Happy Paths:
        assertTrue(Library.mapTemperatures(weeklyMonthTemperatures).contains("63"));
        assertTrue(Library.mapTemperatures(weeklyMonthTemperatures).contains("67"));
        assertTrue(Library.mapTemperatures(weeklyMonthTemperatures).contains("68"));
        assertTrue(Library.mapTemperatures(weeklyMonthTemperatures).contains("69"));
        assertFalse(Library.mapTemperatures(weeklyMonthTemperatures).contains("50"));
        assertFalse(Library.mapTemperatures(weeklyMonthTemperatures).contains("80"));
    }

    @Test public void testTally() {
        List<String> votes = new ArrayList<>();
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Bush");
            votes.add("Shrub");
            votes.add("Hedge");
            votes.add("Shrub");
            votes.add("Bush");
            votes.add("Hedge");
            votes.add("Bush");

        //Happy Paths
        assertTrue(Library.tally(votes).contains("Bush"));
        assertTrue(Library.tally(votes).contains("5 votes"));
        assertFalse(Library.tally(votes).contains("Hedge"));
        assertFalse(Library.tally(votes).contains("Shrub"));
    }
}
