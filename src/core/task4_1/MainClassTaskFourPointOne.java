package core.task4_1;

public class MainClassTaskFourPointOne {

    public static void main(String[] args) {


        Figure currentFigure = null;

        SquareInputController squareInputController = new SquareInputController(System.in);

        int typeFigure = squareInputController.receiveVariantOfFigure();

        switch (typeFigure) {

            case 1:
                currentFigure = new Circle(squareInputController.receiveSideOfFigure(Circle.RADIUS_NAME));
                break;
            case 2:
                currentFigure = new Rectangle(squareInputController.receiveSideOfFigure(Rectangle.SIDE_ONE), squareInputController.receiveSideOfFigure(Rectangle.SIDE_TWO));
                break;
            case 3:
                currentFigure = new IsoscelesTriangle(squareInputController.receiveSideOfFigure(IsoscelesTriangle.SIDE_ONE), squareInputController.receiveSideOfFigure(IsoscelesTriangle.SIDE_ONE));
                break;
            default:
                System.out.println("Сurrent number is not equal 1,2 or 3");

        }

        if (currentFigure != null) {
            System.out.println("Area " + currentFigure.area());
        }

    }
}
