package core.task4_1;

import java.io.InputStream;
import java.util.Scanner;

public class SquareInputController {

    private Scanner in;

    public SquareInputController(InputStream inputStream) {
        in = new Scanner(inputStream);
    }


    public int receiveVariantOfFigure() {
        System.out.print("Choose a figure to calculate the area (1 - Circle, 2 - Rectangle, 3 - IsoscelesTriangle): ");
        return in.nextInt();
    }

    public double receiveSideOfFigure(String nameSide) {
        System.out.print("Input " + nameSide);
        return Math.abs(in.nextDouble());
    }
}
