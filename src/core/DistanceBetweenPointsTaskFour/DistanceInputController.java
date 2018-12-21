package core.DistanceBetweenPointsTaskFour;

import java.io.InputStream;
import java.util.Scanner;

public class DistanceInputController {

    Scanner in;

    public DistanceInputController(InputStream inputFlow) {
        this.in = new Scanner(inputFlow);
    }


    public double getСoordinateOfPoint(String nameOfPoint, String nameOfCoordinate) {
        System.out.print("Point " + nameOfPoint + " Input coordinates of the point " + nameOfCoordinate);
        return in.nextDouble();
    }

    public void showDistance(double distanceValue) {
        System.out.println("Distance:" + distanceValue);
    }

}
