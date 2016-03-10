package com.goit.module_4.area;


public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(3);
        System.out.println("Square of the circle: "+ circle.area());

        Figure rectangle = new Rectangle(4,5);
        System.out.println("Square of the triangle: "+ rectangle.area());

        Figure triangle = new Triangle(3,4,5);
        System.out.println("Square of the triangle: "+ triangle.area());
    }
}
