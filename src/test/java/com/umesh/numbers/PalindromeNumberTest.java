package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PalindromeNumberTest {

    @Test
    void testReverseNumber() {
        assertEquals(4321, PalindromeNumber.reverseNumber(1234));
    }

    @Test
    void testPalindromeTrue() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(PalindromeNumber.isPalindrome(123));
    }
}
