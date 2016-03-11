package com.goit.module_4;


import java.math.BigDecimal;

public class MonteCarlo {
    public static double f(double x) {
        return Math.cos(x);
    }

    public static BigDecimal montecarloIntegration(double a, double b, long iterations, int round) {
// [a, b] is a real interval where a<=b
        if (a > b) {
            return montecarloIntegration(b, a, iterations, round);
        }

        double sum = 0, x = 0;
        for (long i=1; i<=iterations; i++) {
            x = Math.random();
            sum = sum + f(a+((b-a)*x));
        }
        sum = ((b-a)/iterations)*sum;
        return new BigDecimal(sum).setScale(round, BigDecimal.ROUND_HALF_UP);
    }

    public static void main(String[] args) {
        System.out.println("The estimate value is " + montecarloIntegration(0, 1, 10000000, 5));
    }
}
