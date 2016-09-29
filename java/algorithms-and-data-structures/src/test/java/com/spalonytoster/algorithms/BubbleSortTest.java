package com.spalonytoster.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Macieh
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

}
