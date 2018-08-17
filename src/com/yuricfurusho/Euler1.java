package com.yuricfurusho;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Multiples of 3 and 5
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * */
public class Euler1 {

    public static int sumOfMultiples(int x, int y, int max) {
        int sumOfMultiples = 0;
        for (int i = 1; i < max; i++) {
            sumOfMultiples = sumOfMultiples + (i % 3 == 0 || i % 5 == 0 ? i : 0);
        }

        System.out.print("x = " + x + "\n" + "y = " + y + "\n" + "sumOfMultiples = " + sumOfMultiples + "\n");
        return sumOfMultiples;

    }

    @Test
    public void testEuler1() {
        assertEquals(0, sumOfMultiples(3, 5, 1));
        assertEquals(0, sumOfMultiples(3, 5, 2));
        assertEquals(0, sumOfMultiples(3, 5, 3));
        assertEquals(3, sumOfMultiples(3, 5, 4));
        assertEquals(3, sumOfMultiples(3, 5, 5));
        assertEquals(8, sumOfMultiples(3, 5, 6));
        assertEquals(14, sumOfMultiples(3, 5, 7));
        assertEquals(14, sumOfMultiples(3, 5, 8));
        assertEquals(14, sumOfMultiples(3, 5, 9));
        assertEquals(23, sumOfMultiples(3, 5, 10));
        assertEquals(33, sumOfMultiples(3, 5, 11));
        assertEquals(233168, sumOfMultiples(3, 5, 1000));
    }

}
