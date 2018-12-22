package core.СalculationSquareTaskThree;

import core.СalculationSquareTaskThree.Figure;

public class IsoscelesTriangle implements Figure {

    public static String sideOne = "A";
    public static String sideTwo = "B";

    private double side1;
    private double side2;

    public IsoscelesTriangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double area() {
        return side1 * side2 / 2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }
}
