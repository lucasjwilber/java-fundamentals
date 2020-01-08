/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Arrays;

public class Library {

    public boolean someLibraryMethod() {
        return true;
    }

    public static int[] roll(int rolls) {
        if (rolls < 1) {
            System.out.println("Enter a positive integer");
            //need to somehow terminate early here without returning an int[]?
        }
        int[] rollsArr = new int[rolls];
        for (int i = 0; i < rollsArr.length; i++) {
            rollsArr[i] = (int) Math.ceil(Math.random() * 6);
        }
        return rollsArr;
    }

    public static boolean containsDuplicates (int[] arr) {
        boolean result = false;
        checkLoop:
            for (int i = 0; i < arr.length; i++) {
                //loop through and compare each index to the whole array
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j] && j != i) {
                        //if a match is found that ISN'T the original...
                        result = true;
                        break checkLoop;
                    }
                }
            }
        return result;
    }

    public static float calculatesAverages(int[] arr) {
        float average = 0;
        float arrLength = arr.length;
        for (float num : arr) {
            average += num / arrLength;
        }
        return average;
    }

    public static int[] arrayWithLowestAvg(int[][] matrix) {
        int[] lowestAvg = matrix[0];

        if (matrix.length > 1) {
            for (int i = 1; i < matrix.length; i++) {
                if (calculatesAverages(matrix[i]) < calculatesAverages(lowestAvg)) {
                    lowestAvg = matrix[i];
                }
            }
        }
        return lowestAvg;
    }


    public static void main (String[] args) {
        //dice rolls
        System.out.println(Arrays.toString(roll(10)));

        //duplicates
        int[] duplicatesArr = {1, 2, 3, 2, 4, 5};
        int[] noDuplicatesArr = {1, 5, 7, 3};
        System.out.println(containsDuplicates(duplicatesArr));
        System.out.println(containsDuplicates(noDuplicatesArr));

        //average calc
        int[] avgArr1 = {1, 2, 3, 2, 4, 5};
        int[] avgArr2 = {1, 23, 55, 4, 5};
        System.out.println(calculatesAverages(avgArr1));
        System.out.println("avg" + calculatesAverages(avgArr2));

        //lowestAverage
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        for (int[] arr : weeklyMonthTemperatures) {
            System.out.println(calculatesAverages(arr));
        }
        System.out.println(Arrays.toString(arrayWithLowestAvg(weeklyMonthTemperatures)));

    }
}
