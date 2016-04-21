package com.goit.module_4.area;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testArea1() throws Exception {
        double a = 3;
        double b = 4;
        double c = 5;
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertEquals(6, result, 0.0001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testArea2() throws Exception {
        double a = 3;
        double b = -4;
        double c = -5;
        Triangle triangle = new Triangle(a, b, c);
        triangle.area();


    }
}