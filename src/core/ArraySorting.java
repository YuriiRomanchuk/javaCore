package core;

// TODO: (Eugene) 12/20/2018 this class not sorts, but calculates min or max in array. Rename it
public class ArraySorting {

    // TODO: (Eugene) 12/20/2018 argument has non-descriptive name
    public int getMaxValue(int[] arrayUnknown) {

        int maxValue = 0;

        if (arrayUnknown.length > 0) {

            maxValue = arrayUnknown[0];

            // TODO: (Eugene) 12/20/2018 format your code. Add missed spaces
            for (int i = 0; i <= arrayUnknown.length-1; i++) {
                if (maxValue < arrayUnknown[i]) {
                    maxValue = arrayUnknown[i];
                }
            }
        }

        return maxValue;
    }

    // TODO: (Eugene) 12/20/2018 argument has non-descriptive name
    public int getMinValue(int[] arrayUnknown) {

        int minValue = 0;

        if (arrayUnknown.length > 0) {

            minValue = arrayUnknown[0];

            // TODO: (Eugene) 12/20/2018 format your code. Add missed spaces
            for (int i = 0; i <= arrayUnknown.length-1; i++) {
                if (minValue > arrayUnknown[i]) {
                    minValue = arrayUnknown[i];
                }
            }
        }

        return minValue;
    }


}


