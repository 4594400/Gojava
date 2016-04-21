package com.goit.module_4.area;


public class Main {
    public static void main(String[] args) {
        try {
            Figure circle = new Circle(3);
            System.out.println("Square of the circle: "+ circle.area());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            Figure rectangle = new Rectangle(4,-5);
            System.out.println("Square of the rectangle: "+ rectangle.area());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Figure triangle = new Triangle(3,4,5);
            System.out.println("Square of the triangle: "+ triangle.area());
        } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

    }
}
