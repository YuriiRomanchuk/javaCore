package core.task4;

import java.io.InputStream;
import java.util.Scanner;

// TODO: (Eugene) 23.12.2018 too much empty space between methods. One empty line is enough
public class DistanceInputController {
    // TODO: (Eugene) 23.12.2018 make it private
    Scanner in;

    public DistanceInputController(InputStream inputStream) {
        this.in = new Scanner(inputStream);
    }


    public double getСoordinateOfPoint(String nameOfPoint, String nameOfCoordinate) {
        System.out.print("Point " + nameOfPoint + " Input coordinates of the point " + nameOfCoordinate);
        return in.nextDouble();
    }

    public void showDistance(double distanceValue) {
        System.out.println("Distance:" + distanceValue);
    }

}
