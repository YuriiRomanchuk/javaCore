package core.shape;

public class Triangle extends Figure {

    public Triangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    public double area() {
        return side1 * side2 / 2;
    }
}
