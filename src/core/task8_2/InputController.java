package core.task8_2;

import java.util.Scanner;

public class InputController {

    private Scanner in;

    public InputController(Scanner in) {
        this.in = in;
    }

    public int reveiveAnswerToContinueWork() {
        System.out.print("Do you want to continue validate user data? (1 - yes, 2 - no)): ");
        return in.nextInt();
    }

    public int reveiveId() {
        System.out.print("Enter iD: ");
        return in.nextInt();
    }

    public String reveivePassword() {
        System.out.print("Enter password: ");
        return in.next();
    }

}
