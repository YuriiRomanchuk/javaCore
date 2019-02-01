package task11;

import java.io.InputStream;
import java.util.Scanner;

public class AccessPoint {

    private LinePeriodCalculator linePeriodCalculator = new LinePeriodCalculator();
    private MessageController messageController;

    public AccessPoint(InputStream stream) {
        Scanner in = new Scanner(stream);
        messageController = new MessageController(in);
    }

    public void startProgram() {

        String verifiableLine = messageController.receiveVerifiableLine();
        int period = linePeriodCalculator.receiveMinimumLinePeriod(verifiableLine);
        messageController.displayMinimumPeriodLine(period);

    }
}
