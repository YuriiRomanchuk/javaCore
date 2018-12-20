package core.shape;

// TODO: (Eugene) 12/20/2018 strange that triangle has only two sides 
public class Triangle extends Figure {

    public Triangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    public double area() {
        return side1 * side2 / 2;
    }
}
