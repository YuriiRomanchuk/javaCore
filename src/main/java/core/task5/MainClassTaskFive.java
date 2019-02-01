package core.task5;

import java.util.Arrays;

public class MainClassTaskFive {

    public static void main(String[] args) {

        int[] arrayNumbers = {4, 5, 7, 1, 2, 10, 555, 66};
        ArrayExtremumCalculator arrayExtremumCalculator = new ArrayExtremumCalculator();

        int maxValue = arrayExtremumCalculator.maxValue(arrayNumbers);
        System.out.println(maxValue);

        int minValue = arrayExtremumCalculator.minValue(arrayNumbers);
        System.out.println(minValue);

        ArraySortingCalculator arraySortingCalculator = new ArraySortingCalculator();
        System.out.println(Arrays.toString(arraySortingCalculator.bubbleSorting(arrayNumbers)));
        System.out.println(Arrays.toString(arraySortingCalculator.insertIntoSort(arrayNumbers)));

    }

}
