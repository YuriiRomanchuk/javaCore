package core.task11;

public class MainClass {

    public static void main(String[] args) {

        LinePeriodCalculator linePeriodCalculator = new LinePeriodCalculator();
        MessageController messageController = new MessageController(System.in);

        AccessPoint accessPoint = new AccessPoint(messageController, linePeriodCalculator);
        accessPoint.startProgram();
    }
}
