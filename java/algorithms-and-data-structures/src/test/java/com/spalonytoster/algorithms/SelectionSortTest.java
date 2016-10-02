package com.spalonytoster.algorithms;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SelectionSortTest {

    private int[] input = { 8, 6, 2, 1, 3 };

    @Test
    public void selectionSortTest() {
        SelectionSort selectionSort = new SelectionSort();
        int[] output = selectionSort.sort(input);
        int[] referenceOutput = Arrays.copyOf(input, input.length);

        Arrays.sort(referenceOutput);
        assertTrue(Arrays.equals(referenceOutput, output));
        System.out.println("SelectionSort comparisons: " + selectionSort.comparisonCounter);
    }
}
