package core.task4;

public class Point {

    private double x;
    private double y;

    // TODO: (Eugene) 23.12.2018 if it's not final, anyone can change it
    public static String nameX = "x";
    public static String nameY = "y";

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
