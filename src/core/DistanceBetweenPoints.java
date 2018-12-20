package core;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// TODO: (Eugene) 12/20/2018 class does multiple things - takes user input and calculates distance between points
// One class - one logical responsibility. Better to split it, at least into DistanceCalculator and DistanceInputController
public class DistanceBetweenPoints {

    public void distanceBetweenPoints() {

        Map<String, Double> points = new HashMap<>();

        // TODO: (Eugene) 12/20/2018 I guess this should be a separate Point class. Create one
        String[] pointA = new String[2];
        pointA[0] = "x1";
        pointA[1] = "y1";

        String[] pointB = new String[2];
        pointB[0] = "x2";
        pointB[1] = "y2";

        // TODO: (Eugene) 12/20/2018 method with 'get' in the name should return something
        getСoordinateOfPoint("A",  points, pointA);
        getСoordinateOfPoint("B",  points, pointB);

        // TODO: (Eugene) 12/20/2018 btter to place calculation in separate method. Maybe even in separate class (DistanceCalculator)
        double distance = Math.sqrt(Math.pow(points.get(pointB[0]) - points.get(pointA[0]),2) + Math.pow(points.get(pointB[1]) - points.get(pointA[1]),2));

        System.out.println("Distance: " + distance);


    }

    // TODO: (Eugene) 12/20/2018 try to avoid changing of method arguments where it is possible
    // Instead of receiving 'Map points', return it as a result
    // Even better would be to make a separate Point class

    // TODO: (Eugene) 12/20/2018 Argument 'String[] nameOfCoord' tells that you can possibly pass more than two names of coordinates in this array
    // But you calculate distance between point in two-dimensional space. Try to rework this to be more strict

    // TODO: (Eugene) 12/20/2018 allways generify your Collections, e.g. 'Map<String, Double> points'
    private void getСoordinateOfPoint(String  nameOfCoordinate, Map points, String[] nameOfCoord) {

        System.out.println("Input coordinates of the point " + nameOfCoordinate);

        for (int i = 0; i < nameOfCoord.length; i++) {

            Scanner in = new Scanner(System.in);
            System.out.print("Input " + nameOfCoord[i]);
            double coordPoint = in.nextDouble();

            points.put(nameOfCoord[i], coordPoint);

        }

    }

}
