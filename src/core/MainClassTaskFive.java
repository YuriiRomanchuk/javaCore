package core;

import core.ArraySortingTaskFive.ArrayExtremum;
import core.ArraySortingTaskFive.ArraySorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClassTaskFive {

    public static void main(String[] args) {

        int[] arrayNumbers = {4, 5, 7, 1, 2, 10, 555, 66};
        ArrayExtremum arrayExtremum = new ArrayExtremum();

        int maxValue = arrayExtremum.getMaxValue(arrayNumbers);
        System.out.println(maxValue);

        int minValue = arrayExtremum.getMinValue(arrayNumbers);
        System.out.println(minValue);

        ArraySorting arraySorting = new ArraySorting();
        System.out.println(Arrays.toString(arraySorting.bubbleSorting(arrayNumbers)));
        System.out.println(Arrays.toString(arraySorting.insertIntoSort(arrayNumbers)));

    }

}
