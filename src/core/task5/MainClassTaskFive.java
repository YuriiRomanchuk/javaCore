package core.task5;

import java.util.Arrays;

public class MainClassTaskFive {

    public static void main(String[] args) {

        int[] arrayNumbers = {4, 5, 7, 1, 2, 10, 555, 66};
        ArrayExtremumCalсulator arrayExtremumCalсulator = new ArrayExtremumCalсulator();
        // TODO: (Eugene) 23.12.2018 You have russian letters in class name. Try to uncomment the line below
        //arrayExtremumCalculator = new ArrayExtremumCalculator();
        int maxValue = arrayExtremumCalсulator.maxValue(arrayNumbers);
        System.out.println(maxValue);

        int minValue = arrayExtremumCalсulator.minValue(arrayNumbers);
        System.out.println(minValue);

        ArraySortingCalculator arraySortingCalculator = new ArraySortingCalculator();
        System.out.println(Arrays.toString(arraySortingCalculator.bubbleSorting(arrayNumbers)));
        System.out.println(Arrays.toString(arraySortingCalculator.insertIntoSort(arrayNumbers)));

    }

}
