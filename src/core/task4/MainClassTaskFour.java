package core.task4;

public class MainClassTaskFour {

    public static void main(String[] args) {

        DistanceInputController inputController = new DistanceInputController(System.in);

        double coordinateXForA = inputController.getСoordinateOfPoint("A", Point.nameX);
        double coordinateYForA = inputController.getСoordinateOfPoint("A", Point.nameY);

        double coordinateXForB = inputController.getСoordinateOfPoint("B", Point.nameX);
        double coordinateYForB = inputController.getСoordinateOfPoint("B", Point.nameY);

        Point pointA = new Point(coordinateXForA, coordinateYForA);
        Point pointB = new Point(coordinateXForB, coordinateYForB);

        DistanceCalculator DistanceCalculator = new DistanceCalculator();
        double distance = DistanceCalculator.calculateDistanceBetweenPoints(pointA, pointB);
        inputController.showDistance(distance);

    }

}
