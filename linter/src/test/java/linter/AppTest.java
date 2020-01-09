/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    public static int countLinterErrors(String path) {
        String manyFileResults = App.linter(path);
        String errorFound = "is missing a semi-colon";
        int errorCount = 0;
        int fromIndex = 0;
        while ((fromIndex = manyFileResults.indexOf(errorFound, fromIndex)) != -1 ){
            errorCount++;
            fromIndex++;
        }
        return errorCount;
    }

    @Test public void linterTest() {
        //Happy Paths:
        assertTrue(App.linter("../linter/src/test/resources/linterTest_one.js").contains("Line 2"));
        assertFalse(App.linter("../linter/src/test/resources/linterTest_one.js").contains("Line 1"));
        assertEquals(1, countLinterErrors("../linter/src/test/resources/linterTest_one.js"));

        //there are 58 missing semi-colons in linterTest_many.js
        assertEquals(49, countLinterErrors("../linter/src/test/resources/linterTest_many.js"));
        assertFalse(App.linter("../linter/src/test/resources/linterTest_many.js").contains("Line 64"));

        //there are 3 missing semi-colons in linterTest_few.js
        assertEquals(3, countLinterErrors("../linter/src/test/resources/linterTest_few.js"));

        //there are no errors in linterTest_empty.js
        assertEquals(0, countLinterErrors("../linter/src/test/resources/linterTest_empty.js"));
    }
}
