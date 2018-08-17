package com.yuricfurusho;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Largest prime factor
 * Problem 3
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Euler3 {

    public long largestPrimeFactor(long n) {
        long i = 2L;
        while (n != 1) {
            if (n % i  == 0) {
                n = n / i;
            } else {
                i++;
            }
        }
        return i;
    }

    @Test
    public void testEuler3() {
        assertEquals(2, largestPrimeFactor(2L));
        assertEquals(3, largestPrimeFactor(6L));
        assertEquals(7, largestPrimeFactor(21L));
        assertEquals(29, largestPrimeFactor(13195L));
        assertEquals(6857, largestPrimeFactor(600851475143L));
    }
}
