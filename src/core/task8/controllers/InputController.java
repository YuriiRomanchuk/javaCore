package core.task8.controllers;

import java.util.Scanner;

public class InputController {

    private Scanner in;

    public InputController(Scanner in) {
        this.in = in;
    }

    public int receiveVariantOfTable() {
        System.out.print("Select version of table(1 - full, 2 - lite)): ");
        return in.nextInt();
    }
}
