package core.shape;

public class Rectangle extends Figure {

    public Rectangle(double side1, double side2) {
        super(side1, side2);
    }

    // TODO: (Eugene) 12/20/2018 format your code. Add missed spaces
    @Override
    public double area() {
        return side1*side2;
    }

}
