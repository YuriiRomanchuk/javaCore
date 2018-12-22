package core;

import core.СalculationSquareTaskThree.*;

import java.util.Scanner;

public class MainClassTaskThree {

    public static void main(String[] args) {


        Figure currentFigure = null;

        SquareInputController squareInputController = new SquareInputController(System.in);

        int typeFigure = squareInputController.getVariantOfFigure();

        switch (typeFigure) {

            case 1:
                currentFigure = new Circle(squareInputController.getSideOfFigure(Circle.radiusName));
                break;
            case 2:
                currentFigure = new Rectangle(squareInputController.getSideOfFigure(Rectangle.sideOne), squareInputController.getSideOfFigure(Rectangle.sideTwo));
                break;
            case 3:
                currentFigure = new IsoscelesTriangle(squareInputController.getSideOfFigure(IsoscelesTriangle.sideOne), squareInputController.getSideOfFigure(IsoscelesTriangle.sideOne));
                break;
            default:
                System.out.println("Сurrent number is not equal 1,2 or 3");

        }

        if (currentFigure != null) {
            System.out.println("Area " + currentFigure.area());
        }

    }
}
