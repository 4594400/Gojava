package com.goit.module_5;

import org.junit.Test;

import static org.junit.Assert.*;


public class SortingAnArrayTest {
    private SortingAnArray sortingAnArray;

    @Test
    public void testQuickSort() throws Exception {
        int [] intArray = new int[] {5, 6, 3, 5, 1, 0};
        int low = 0;
        int high = intArray.length - 1;
        SortingAnArray.quickSort(intArray, low, high);
        assertArrayEquals(new int [] {0,1,3,5,5,6}, intArray);
    }

    @Test
    public void testQuickSortArrayOfZero() throws Exception {
        int [] intArray = new int[6];
        int low = 0;
        int high = intArray.length - 1;
        SortingAnArray.quickSort(intArray, low, high);
        assertArrayEquals(new int [] {0,0,0,0,0,0}, intArray);
    }
}
