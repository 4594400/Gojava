package com.goit.module_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySearchTest {
    ArraySearch arraySearch;

    @Test
    public void testMinElementOfArray() throws Exception {
        int [] intArray  = new int[] {3,0,9,7,5,8};
        int result  =  ArraySearch.minElementOfArray(intArray);
        assertEquals(0, result);
    }

    @Test
    public void testMaxElementOfArray() throws Exception {
        int [] intArray  = new int[] {3,0,9,7,5,8};
        int result  =  ArraySearch.maxElementOfArray(intArray);
        assertEquals(9, result);
    }

    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testNoElementsInArray() throws ArrayIndexOutOfBoundsException {
        int [] intArray  = new int[0];
        ArraySearch.minElementOfArray(intArray);
    }

    @Test (expected = NullPointerException.class)
    public void testArrayIsNull() throws NullPointerException {
        int [] intArray  = null;
        ArraySearch.minElementOfArray(intArray);
    }

}