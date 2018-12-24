package core.task5;

public class ArrayExtremumCalсulator {

    public int maxValue(int[] arrayNumber) {

        int maxValue = 0;

        if (arrayNumber.length > 0) {

            maxValue = arrayNumber[0];

            for (int i = 0; i <= arrayNumber.length - 1; i++) {
                if (maxValue < arrayNumber[i]) {
                    maxValue = arrayNumber[i];
                }
            }
        }

        return maxValue;
    }

    public int minValue(int[] arrayNumber) {

        int minValue = 0;

        if (arrayNumber.length > 0) {

            minValue = arrayNumber[0];

            for (int i = 0; i <= arrayNumber.length - 1; i++) {
                if (minValue > arrayNumber[i]) {
                    minValue = arrayNumber[i];
                }
            }
        }

        return minValue;
    }
}
