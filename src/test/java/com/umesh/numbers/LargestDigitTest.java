package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LargestDigitTest {

    @Test
    void testNormalNumber() {
        assertEquals(9, LargestDigit.largestDigit(5923));
    }

    @Test
    void testSingleDigit() {
        assertEquals(7, LargestDigit.largestDigit(7));
    }

    @Test
    void testAllSameDigits() {
        assertEquals(4, LargestDigit.largestDigit(444));
    }
}
