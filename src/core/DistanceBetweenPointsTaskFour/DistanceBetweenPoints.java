package core.DistanceBetweenPointsTaskFour;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistanceBetweenPoints {

    public void distanceBetweenPoints() {

        Map <String, Double> points = new HashMap <>( );

        String[] pointA = new String[2];
        pointA[0] = "x1";
        pointA[1] = "y1";

        String[] pointB = new String[2];
        pointB[0] = "x2";
        pointB[1] = "y2";

        getСoordinateOfPoint("A", points, pointA);
        getСoordinateOfPoint("B", points, pointB);

        double distance = Math.sqrt(Math.pow(points.get(pointB[0]) - points.get(pointA[0]), 2) + Math.pow(points.get(pointB[1]) - points.get(pointA[1]), 2));

        System.out.println("Distance: " + distance);


    }

    private void getСoordinateOfPoint(String nameOfCoordinate, Map points, String[] nameOfCoord) {

        System.out.println("Input coordinates of the point " + nameOfCoordinate);

        for (int i = 0; i < nameOfCoord.length; i++) {

            Scanner in = new Scanner(System.in);
            System.out.print("Input " + nameOfCoord[i]);
            double coordPoint = in.nextDouble( );

            points.put(nameOfCoord[i], coordPoint);

        }

    }

}
