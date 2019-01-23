package core.task9_1;

import java.io.InputStream;
import java.util.Scanner;

public class InputController {

    Scanner in;

    public InputController(InputStream in) {
        this.in = new Scanner(in);
    }

    public String receiveLineNumbers() {

        return in.nextLine();
    }


}
