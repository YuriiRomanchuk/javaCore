package core;

import core.shape.Circle;
import core.shape.Figure;
import core.shape.Rectangle;
import core.shape.Triangle;
import java.util.Scanner;

// TODO: (Eugene) 12/20/2018 class name does not describe it's purpose
public class Lesson4FiguresSquare {

    // TODO: (Eugene) 12/20/2018 Method names start with lowercase
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

    // TODO: (Eugene) 12/20/2018 method name does not describe what it does
    private double getSide(String nameSide) {

        // TODO: (Eugene) 12/20/2018 you create another scanner - maybe you should reuse existing one
        // or even make a field for it
        Scanner in = new Scanner(System.in);
        System.out.print("Input " + nameSide);

        // TODO: (Eugene) 12/20/2018 variable name does not describe it's purpose
        double typeFigure = in.nextDouble( );

        // TODO: (Eugene) 12/20/2018  better to restrict negative numbers as wrong input instead of making it positive under the hood
        return getNonNegativeNumber(typeFigure);
    }

    private double getNonNegativeNumber(double num) {
        // TODO: (Eugene) 12/20/2018 you could use Math.abs(num)
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
}
