package com.spalonytoster.algorithms;

import java.util.Arrays;

public class BubbleSort2 implements SortingAlgorithm {

    public int comparisonCounter = 0;

    public int[] sort(int[] toSort) {
        int[] array = Arrays.copyOf(toSort, toSort.length);
        int n = array.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                comparisonCounter++;
                if (array[j-1] > array[j]) {
                    swap(j-1, j, array);
                }
            }
        }
        return array;
    }

    private void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}