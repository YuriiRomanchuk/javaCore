package core.shape;

// TODO: (Eugene) 12/20/2018 a bit strange that any figure has only axactly sides 
public abstract class Figure {

    protected double side1;
    protected double side2;

    public Figure(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    public abstract double area();

    public static void sayHello() {
        System.out.println("mj");
    }


}
