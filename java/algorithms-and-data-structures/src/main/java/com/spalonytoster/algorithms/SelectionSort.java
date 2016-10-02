package com.spalonytoster.algorithms;

import java.util.Arrays;

public class SelectionSort implements SortingAlgorithm {

    public int comparisonCounter = 0;

    @Override
    public int[] sort(int[] toSort) {
        int[] array = Arrays.copyOf(toSort, toSort.length);

        for (int i = array.length-1; i > 0; i--) {
            int maxIndex = maxIndex(i, array);
            swap(i, maxIndex, array);
        }
        return array;
    }

    private int maxIndex(int end, int[] array) {
        int index = 0;
        for (int i = 1; i <= end; i++) {
            comparisonCounter++;
            if (array[i] > array[index]) {
                index = i;
            }
        }
        return index;
    }

    private void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
