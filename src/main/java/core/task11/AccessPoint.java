package src.main.java.core.task11;

public class AccessPoint {

    private LinePeriodCalculator linePeriodCalculator;
    private MessageController messageController;

    public AccessPoint(MessageController messageController, LinePeriodCalculator linePeriodCalculator) {
        this.messageController = messageController;
        this.linePeriodCalculator = linePeriodCalculator;
    }

    public void startProgram() {

        String verifiableLine = messageController.receiveVerifiableLine();
        int period = linePeriodCalculator.receiveMinimumLinePeriod(verifiableLine);
        messageController.displayMinimumPeriodLine(period);

        period = linePeriodCalculator.receiveMinimumLinePeriodLite(verifiableLine);
        messageController.displayMinimumPeriodLine(period);

    }
}
