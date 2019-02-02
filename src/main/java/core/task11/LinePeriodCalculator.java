package core.task11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public int receiveMinimumLinePeriodLite(String periodLine) {

        char[] charsLine = periodLine.toCharArray();
        Character[] newArray = IntStream.range(0, charsLine.length)
                .mapToObj(i -> charsLine[i])
                .toArray(Character[]::new);

        List<Character> uniqueSymbols = Arrays.stream(newArray)
                .distinct()
                .collect(Collectors.toList());

        return uniqueSymbols.size();
    }
}
