package task4;

import java.io.InputStream;
import java.util.Scanner;

public class DistanceInputController {

    private Scanner in;

    public DistanceInputController(InputStream inputStream) {
        this.in = new Scanner(inputStream);
    }


    public double receiveСoordinateOfPoint(String nameOfPoint, String nameOfCoordinate) {
        System.out.print("Point " + nameOfPoint + " Input coordinates of the point " + nameOfCoordinate);
        return in.nextDouble();
    }

    public void showDistance(double distanceValue) {
        System.out.println("Distance:" + distanceValue);
    }

}
