package core.task4_1;

public class MainClassTaskFourPointOne {
    // TODO: (Eugene) 23.12.2018 too much empty space in method
    public static void main(String[] args) {


        Figure currentFigure = null;

        SquareInputController squareInputController = new SquareInputController(System.in);

        int typeFigure = squareInputController.getVariantOfFigure();

        switch (typeFigure) {

            case 1:
                // TODO: (Eugene) 23.12.2018 Constants are good. But when you have only one place where you use them - you don't need them
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
