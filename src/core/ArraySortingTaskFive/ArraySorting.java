package core.ArraySortingTaskFive;

public class ArraySorting {


    public int getMaxValue(int[] arrayUnknown) {

        int maxValue = 0;

        if (arrayUnknown.length > 0) {

            maxValue = arrayUnknown[0];

            for (int i = 0; i <= arrayUnknown.length - 1; i++) {
                if (maxValue < arrayUnknown[i]) {
                    maxValue = arrayUnknown[i];
                }
            }
        }

        return maxValue;
    }

    public int getMinValue(int[] arrayUnknown) {

        int minValue = 0;

        if (arrayUnknown.length > 0) {

            minValue = arrayUnknown[0];

            for (int i = 0; i <= arrayUnknown.length - 1; i++) {
                if (minValue > arrayUnknown[i]) {
                    minValue = arrayUnknown[i];
                }
            }
        }

        return minValue;
    }


}


