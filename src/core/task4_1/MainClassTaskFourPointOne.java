package core.task4_1;

public class MainClassTaskFourPointOne {

    public static void main(String[] args) {


        Figure currentFigure = null;

        SquareInputController squareInputController = new SquareInputController(System.in);

        int typeFigure = squareInputController.getVariantOfFigure();

        switch (typeFigure) {

            case 1:
                currentFigure = new Circle(squareInputController.getSideOfFigure(Circle.RADIUS_NAME));
                break;
            case 2:
                currentFigure = new Rectangle(squareInputController.getSideOfFigure(Rectangle.SIDE_ONE), squareInputController.getSideOfFigure(Rectangle.SIDE_TWO));
                break;
            case 3:
                currentFigure = new IsoscelesTriangle(squareInputController.getSideOfFigure(IsoscelesTriangle.SIDE_ONE), squareInputController.getSideOfFigure(IsoscelesTriangle.SIDE_ONE));
                break;
            default:
                System.out.println("Сurrent number is not equal 1,2 or 3");

        }

        if (currentFigure != null) {
            System.out.println("Area " + currentFigure.area());
        }

    }
}
