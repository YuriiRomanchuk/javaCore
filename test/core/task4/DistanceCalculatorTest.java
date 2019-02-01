package task4;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
class DistanceCalculatorTest {

    @Test
    void calculateDistanceBetweenPoints() {

        Point A = new Point(1,3);
        Point B = new Point(2,3);

       DistanceCalculator distanceCalculator =  new DistanceCalculator();
       double res = distanceCalculator.calculateDistanceBetweenPoints(A, B);

        System.out.println(res);
        Assert.assertEquals(11, res,0);
    }

}