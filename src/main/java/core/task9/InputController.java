package core.task9;

import java.util.Scanner;

public class InputController {

    Scanner in;

    public InputController(Scanner in) {
        this.in = in;
    }

    public int receiveShift() {
        System.out.println("Please, input shift: ");
        return in.nextInt();
    }
}
