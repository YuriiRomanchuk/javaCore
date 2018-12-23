package core.task5;

public class ArraySorting {


    public int[] bubbleSorting(int[] arrayNumbers) {

        boolean nextStep = true;

        while (nextStep) {

            nextStep = false;

            for (int counter = 1; counter <= arrayNumbers.length - 1; counter++) {

                int temp;

                if (arrayNumbers[counter] < arrayNumbers[counter - 1]) {
                    temp = arrayNumbers[counter - 1];
                    arrayNumbers[counter - 1] = arrayNumbers[counter];
                    arrayNumbers[counter] = temp;
                    nextStep = true;
                }

            }

        }

        return arrayNumbers;
    }

    public int[] insertIntoSort(int[] arrayNumbers) {
        int temp, backCounter;

        for (int i = 0; i < arrayNumbers.length - 1; i++) {
            if (arrayNumbers[i] > arrayNumbers[i + 1]) {
                temp = arrayNumbers[i + 1];
                arrayNumbers[i + 1] = arrayNumbers[i];
                backCounter = i;
                while (backCounter > 0 && temp < arrayNumbers[backCounter - 1]) {
                    arrayNumbers[backCounter] = arrayNumbers[backCounter - 1];
                    backCounter--;
                }
                arrayNumbers[backCounter] = temp;
            }

        }

        return arrayNumbers;

    }

}