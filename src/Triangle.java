public class Triangle extends Figure {

    Triangle(double side1, double side2) {
        super(side1, side2);
    }

    @Override
    double area() {
        return side1*side2/2;
    }
}
