import java.util.Scanner;

public class Lesson4FiguresSquare {

    public static void main(String args[]) {

        Figure currentFigure = null;

        Scanner in = new Scanner(System.in);
        System.out.print("Choose a shape to calculate the area (1 - Circle, 2 - Rectangle, 3 - Triangle): ");
        int typeFigure = in.nextInt( );

        switch (typeFigure) {

            case 1:
                currentFigure = new Circle(getSide("R"), 0);
                break;
            case 2:
                currentFigure = new Rectangle(getSide("A"), getSide("B"));
                break;
            case 3:
                currentFigure = new Triangle(getSide("A"), getSide("B"));
                break;
            default:
                System.out.println("Сurrent number is not equal 1,2 or 3");

        }

        if (currentFigure != null) {
            System.out.println("Площадь равна " + currentFigure.area( ));
        }
    }

}

    public static double getSide(String nameSide) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input " + nameSide);
        double typeFigure = in.nextInt( );

        return getNonNegativeNumber(typeFigure);
    }

    public boolean isDigit(double num) {

        return Character.isDigit((int) num));
    }

    public static double getNonNegativeNumber(double num) {

        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
