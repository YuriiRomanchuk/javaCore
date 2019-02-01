package task11;

import java.util.Scanner;

public class MessageController {

    private Scanner in;

    public MessageController(Scanner in) {
        this.in = in;
    }

    public String receiveVerifiableLine() {
        System.out.println("Input line: ");
        return in.nextLine();
    }

    public void displayMinimumPeriodLine(int minPeriod) {
        System.out.println(String.format("Smallest period for line: %s", minPeriod));
    }
}
