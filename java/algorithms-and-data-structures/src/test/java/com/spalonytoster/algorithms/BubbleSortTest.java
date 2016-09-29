package com.spalonytoster.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class BubbleSortTest {

//    private int[] input = { 8, 6, 2, 1, 3 };
    private int[] input = { 16, 62, 25, 96, 48, 46, 61, 12, 94, 81,
        5, 30, 2, 93, 68, 18, 73, 9, 7, 85 };

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

    @Test
    public void bubbleSort3Test() {
        BubbleSort3 bubbleSort = new BubbleSort3();
        int[] output = bubbleSort.sort(input);
        int[] referenceOutput = Arrays.copyOf(input, input.length);

        Arrays.sort(referenceOutput);
        assertTrue(Arrays.equals(referenceOutput, output));
        System.out.println("BubbleSort3 comparisons: " + bubbleSort.comparisonCounter);
    }

}
