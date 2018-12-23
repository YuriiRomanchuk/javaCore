package core.task5;

public class ArraySortingCalculator {


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

    // TODO: (Eugene) 23.12.2018 hmmm.... ;) https://ru.wikibooks.org/wiki/%D0%A0%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8_%D0%B0%D0%BB%D0%B3%D0%BE%D1%80%D0%B8%D1%82%D0%BC%D0%BE%D0%B2/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0/%D0%92%D1%81%D1%82%D0%B0%D0%B2%D0%BA%D0%B0%D0%BC%D0%B8#Java_1
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