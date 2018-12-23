package core.task4;

public class DistanceCalculator {

    public double getDistanceBetweenPoints(Point pointA, Point pointB) {

        return Math.sqrt(Math.pow(pointB.getY() - pointA.getY(), 2) + Math.pow(pointB.getX() - pointA.getX(), 2));

    }
}
