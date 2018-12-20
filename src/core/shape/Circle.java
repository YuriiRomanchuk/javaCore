package core.shape;

public class Circle extends Figure {

    // TODO: (Eugene) 12/20/2018 you never use side2. Why do you even have sides in a circle?
    public Circle(double side1, double side2) {
        super(side1, side2);
    }

    // TODO: (Eugene) 12/20/2018 format your code. Add missed spaces
    @Override
    public double area() {
        return Math.PI*Math.pow(side1,2);
    }
}
