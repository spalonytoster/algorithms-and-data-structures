package com.spalonytoster.algorithms;

import java.util.Arrays;

/**
 * Created by Macieh on 2016-09-26.
 */
public class BubbleSort implements SortingAlgorithm {

    public int[] sort(int[] input) {
        int[] output = Arrays.copyOf(input, input.length);
        boolean notSorted = true;

        while (notSorted) {
            notSorted = iterationResult(output);
        }
        return output;
    }

    private boolean iterationResult(int[] input) {
        boolean notSorted = true;
        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                notSorted = false;
                continue;
            }
            if (input[i] > input[i+1]) {
                swap(i, i+1, input);
            }
        }
        return notSorted;
    }

    public void swap(int a, int b, int[] array) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
