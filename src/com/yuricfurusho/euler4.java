package com.yuricfurusho;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Largest palindrome product
 * Problem 4
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class euler4 {

    public int largestPalindromeProduct(int nDigits) {
        isPalindromeNumber(2);

    }

    private boolean isPalindromeNumber(int i) {
        i
    }

    @Test
    public void testEuler4() {
        assertEquals(9009, largestPalindromeProduct(2));
    }

    @Test
    public void testIsPalindrome() {
        assertEquals(true, isPalindromeNumber(9009));
        assertEquals(true, isPalindromeNumber(10));
        assertEquals(true, isPalindromeNumber(11));
        assertEquals(true, isPalindromeNumber(22));
        assertEquals(true, isPalindromeNumber(33));
        assertEquals(true, isPalindromeNumber(100));
        assertEquals(true, isPalindromeNumber(101));
        assertEquals(true, isPalindromeNumber(121));
        assertEquals(true, isPalindromeNumber(1212));
        assertEquals(true, isPalindromeNumber(1221));
        assertEquals(true, isPalindromeNumber(1221));
    }
}
