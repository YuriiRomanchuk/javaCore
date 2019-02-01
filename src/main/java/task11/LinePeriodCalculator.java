package task11;

public class LinePeriodCalculator {


    public int receiveMinimumLinePeriod(String line) {

        int minPeriod = line.length();
        char[] charsLine = line.toCharArray();

        for (int period = 1; period <= (minPeriod / 2); period++) {

            int index = 0;

            while (index < (minPeriod - period)
                    && charsLine[index] == charsLine[index + period]) {
                index++;
            }

            if (index == (line.length() - period)) {
                minPeriod = period;
                break;
            }
        }

        return minPeriod;
    }
}
