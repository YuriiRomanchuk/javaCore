package task11;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class LinePeriodCalculatorTest {

    @Test
    @Parameters(method = "testRequestLoan_Parameters")
    public void receiveMinimumLinePeriodTest(String line, int minPeriodExpected) {

        LinePeriodCalculator linePeriodCalculator = new LinePeriodCalculator();
        int minPeriodActual = linePeriodCalculator.receiveMinimumLinePeriod(line);

        Assert.assertEquals(minPeriodExpected, minPeriodActual);

    }

    @SuppressWarnings("unused")
    private static Object[][] testRequestLoan_Parameters() {
        return new Object[][]{
                {"abcabcabcabc", 3},
                {"abcdefg", 3},
                {"qwertyqwertyqwerty", 6}
        };

    }
}
