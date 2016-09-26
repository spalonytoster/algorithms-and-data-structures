package com.spalonytoster.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Macieh on 2016-09-26.
 */
public class BubbleSortTest {

    private int[] input = { 8, 6, 2, 1, 3 };
    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void sortTest() {
        int[] output = bubbleSort.sort(input);
        int[] referenceOutput = Arrays.copyOf(input, input.length);

        Arrays.sort(referenceOutput);
        assertTrue(Arrays.equals(referenceOutput, output));
    }

    @Test
    public void swapTest() {
        int[] input = { 1, 2 };
        int[] desiredResult = { 2, 1 };

        bubbleSort.swap(0, 1, input);

        assertTrue(Arrays.equals(desiredResult, input));
    }
}
