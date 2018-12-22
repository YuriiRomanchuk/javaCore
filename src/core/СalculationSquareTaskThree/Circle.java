package core.СalculationSquareTaskThree;

public class Circle implements Figure {

    public static String radiusName = "R";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
