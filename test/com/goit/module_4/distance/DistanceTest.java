package com.goit.module_4.distance;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistanceTest {
    private Distance distance;

    @Test
    public void testCalculateDistance() throws Exception {
        double x1 = 2.0;
        double x2 = 3.3;
        double y1 = 5.3;
        double y2 = 9.1;
        double result = Distance.calculateDistance(x1, x2, y1, y2);
        assertEquals(4.016, result, 0.001);
    }
}