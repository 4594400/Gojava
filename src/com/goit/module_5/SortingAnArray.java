package com.goit.module_5;


import java.util.Arrays;

public class SortingAnArray {
    public static void main(String[] args) {
        int[] intArray = {5, 2, 4, 8, 3, 8, 10};

        System.out.println("Unsorted array: " + Arrays.toString(intArray));

        int low = 0;
        int high = intArray.length - 1;

        quickSort(intArray, low, high);
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }


    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }
}
