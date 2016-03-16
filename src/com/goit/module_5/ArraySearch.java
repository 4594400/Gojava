package com.goit.module_5;


import java.util.Arrays;
import java.util.Random;

public class ArraySearch {

        public static void main(String[] args) {
            int[] intArray = new int[5];
            for(int i = 0; i < intArray.length; i++) {
                intArray[i] = randomize(9);
            }

            Arrays.sort(intArray);

            for (int element : intArray) {
                System.out.println(element);
            }

            System.out.println("Min element: " + intArray[0]);
            System.out.println("Max element: " + intArray[intArray.length-1]);
        }

    public static int  randomize(int k){
        Random rand = new Random();
        return rand.nextInt(k);
    }
   }
