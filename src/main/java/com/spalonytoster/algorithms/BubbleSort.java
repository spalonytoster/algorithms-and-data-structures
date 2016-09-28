package com.spalonytoster.algorithms;

import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm {

    public int comparisonCounter = 0;

    public int[] sort(int[] toSort) {
        int[] output = Arrays.copyOf(toSort, toSort.length);

        for (int i = output.length-1; i > 0; i--) {
            output = iterationResult(output, i);
        }
        return output;
    }

    private int[] iterationResult(int[] original, int end) {
        int [] input = Arrays.copyOf(original, original.length);
        for (int i = 0; i < end; i++) {
            comparisonCounter++;
            if (input[i] > input[i+1]) {
                swap(i, i+1, input);
            }
        }
        return input;
    }

    private void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
