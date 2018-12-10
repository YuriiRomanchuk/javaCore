public class Circle extends Figure {

    Circle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    double area() {
        return Math.PI*Math.pow(side1,2);
    }
}
