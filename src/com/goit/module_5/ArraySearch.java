package com.goit.module_5;


import java.util.Arrays;
import java.util.Random;

public class ArraySearch {

    public static void main(String[] args) {
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = randomize(9);
        }
        for (int element : intArray) {
            System.out.println(element);
        }
        minElementOfArray(intArray);
        System.out.println("Min element: " + intArray[0]);
        maxElementOfArray(intArray);
        System.out.println("Max element: " + intArray[intArray.length - 1]);
    }

    public static int minElementOfArray(int[] intArray) {
        if (intArray.length==0) {
            throw new ArrayIndexOutOfBoundsException("|ERROR| Array not initialized");
        }
        else if (intArray==null) {
            throw new NullPointerException("|ERROR| Array is NULL");
        }
        Arrays.sort(intArray);
        return intArray[0];
    }

    public static int maxElementOfArray(int[] intArray) {
        if (intArray.length==0) {
            throw new ArrayIndexOutOfBoundsException("|ERROR| Array not initialized");
        }
        else if (intArray==null) {
            throw new NullPointerException("|ERROR| Array is NULL");
        }
        Arrays.sort(intArray);
        return intArray[intArray.length - 1];
    }

    public static int randomize(int k) {
        Random rand = new Random();
        return rand.nextInt(k);
    }
}
