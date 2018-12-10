public abstract class Figure {

    double side1;
    double side2;

    Figure() {
        this.side1 = side1;
        this.side2 = side2;
    }

    abstract double area() {
        System.out.println("Undefined area.");
        return 0;
    }
}
