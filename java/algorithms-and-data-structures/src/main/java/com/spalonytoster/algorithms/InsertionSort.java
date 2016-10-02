package com.spalonytoster.algorithms;

import java.util.Arrays;

public class InsertionSort implements SortingAlgorithm {

    int comparisonCounter = 0;

    @Override
    public int[] sort(int[] toSort) {
        int[] array = Arrays.copyOf(toSort, toSort.length);

        for (int i = 1; i < array.length; i++) {
            insertIntoSortedPart(i, array);
        }
        return array;
    }

    private void insertIntoSortedPart(int sortedEnd, int[] array) {
        int valIndex = sortedEnd;
        for (int i = sortedEnd-1; i >= 0; i--) {
            comparisonCounter++;
            if (array[i] > array[valIndex]) {
                swap(i, valIndex, array);
                valIndex--;
            }
        }
    }

    private void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
