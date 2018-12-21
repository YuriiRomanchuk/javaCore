package core;

import core.ArraySortingTaskFive.ArrayExtremum;
import core.ArraySortingTaskFive.ArraySorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClassTaskFive {

    public static void main(String[] args) {

        int[] arrayNumbers = {4, 5, 7, 1, 2, 10, 555, 66};
        ArrayExtremum ArrayExtremum = new ArrayExtremum();

        int maxValue = ArrayExtremum.getMaxValue(arrayNumbers);
        System.out.println(maxValue);

        int minValue = ArrayExtremum.getMinValue(arrayNumbers);
        System.out.println(minValue);

        ArraySorting ArraySorting = new ArraySorting();
        System.out.println(Arrays.toString(ArraySorting.bubbleSorting(arrayNumbers)));
        System.out.println(Arrays.toString(ArraySorting.insertIntoSort(arrayNumbers)));

    }

}
