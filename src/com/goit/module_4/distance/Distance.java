package com.goit.module_4.distance;


public class Distance {
    public static void main(String[] args) {
        System.out.println(calculateDistance(2.0, 3.3, 5.3, 9.1));
    }

    public static double calculateDistance(double x1, double x2, double y1, double y2){
        return Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

    }
}
