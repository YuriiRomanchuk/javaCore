package core.shape;

public class Circle extends Figure {

    public Circle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(side1, 2);
    }
}
