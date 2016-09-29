package com.spalonytoster.algorithms;

import java.util.Arrays;

public class BubbleSort3 implements SortingAlgorithm {

    public int comparisonCounter = 0;

    public int[] sort(int[] toSort) {
        int[] array = Arrays.copyOf(toSort, toSort.length);
        int n = array.length;
        boolean sorted = true;

        for (int i = 0; i < n-1; i++) {
            sorted = true;
            for (int j = n-1; j > i; j--) {
                comparisonCounter++;
                if (array[j-1] > array[j]) {
                    swap(j-1, j, array);
                    sorted = false;
                }
            }
        }
        if (sorted) {
            return array;
        }
        return array;
    }

    private void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}