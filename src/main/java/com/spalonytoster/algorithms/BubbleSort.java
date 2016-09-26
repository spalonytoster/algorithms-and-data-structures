package com.spalonytoster.algorithms;

import java.util.Arrays;

/**
 * Created by Macieh
 */
public class BubbleSort implements SortingAlgorithm {

    public int[] sort(int[] toSort) {
        int[] output = Arrays.copyOf(toSort, toSort.length);

        for (int i = 0; i < output.length; i++) {
            output = iterationResult(output);
        }
        return output;
    }

    private int[] iterationResult(int[] original) {
        int [] input = Arrays.copyOf(original, original.length);
        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                continue;
            }
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
