package com.spalonytoster.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class BubbleSortTest {

    private int[] input = { 8, 6, 2, 1, 3 };

    @Test
    public void bubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] output = bubbleSort.sort(input);
        int[] referenceOutput = Arrays.copyOf(input, input.length);

        Arrays.sort(referenceOutput);
        assertTrue(Arrays.equals(referenceOutput, output));
        System.out.println("BubbleSort1 comparisons: " + bubbleSort.comparisonCounter);
    }

    @Test
    public void bubbleSort2Test() {
        BubbleSort2 bubbleSort = new BubbleSort2();
        int[] output = bubbleSort.sort(input);
        int[] referenceOutput = Arrays.copyOf(input, input.length);

        Arrays.sort(referenceOutput);
        assertTrue(Arrays.equals(referenceOutput, output));
        System.out.println("BubbleSort2 comparisons: " + bubbleSort.comparisonCounter);
    }

}
