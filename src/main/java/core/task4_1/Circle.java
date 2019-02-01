package core.task4_1;

public class Circle implements Figure {

    public static final String RADIUS_NAME = "R";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
