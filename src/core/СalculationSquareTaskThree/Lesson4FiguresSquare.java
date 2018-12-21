package core.СalculationSquareTaskThree;

import java.util.Scanner;

public class Lesson4FiguresSquare {

    public void Lesson4FiguresSquare() {

        Figure currentFigure = null;

        Scanner in = new Scanner(System.in);
        System.out.print("Choose a figure to calculate the area (1 - Circle, 2 - Rectangle, 3 - Triangle): ");
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
            System.out.println("Area " + currentFigure.area( ));
        }
    }

    private double getSide(String nameSide) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input " + nameSide);
        double typeFigure = in.nextDouble( );

        return getNonNegativeNumber(typeFigure);
    }

    private double getNonNegativeNumber(double num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
}
