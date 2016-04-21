package com.goit.module_4.area;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testArea1() throws Exception {
        double a = 4;
        double b = 5;
        Rectangle rectangle = new Rectangle(a, b);
        double result = rectangle.area();
        assertEquals(a*b, result, 0.0001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testArea2() throws Exception {
        double a = 4;
        double b = -5;
        Rectangle rectangle = new Rectangle(a, b);
        rectangle.area();

    }
}