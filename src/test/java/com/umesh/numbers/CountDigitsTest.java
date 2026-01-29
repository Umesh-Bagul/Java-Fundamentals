package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CountDigitsTest {

    @Test
    void testPositiveNumber() {
        assertEquals(3, CountDigits.countDigit(123));
    }

    @Test
    void testSingleDigit() {
        assertEquals(1, CountDigits.countDigit(7));
    }

    @Test
    void testZero() {
        assertEquals(1, CountDigits.countDigit(0));
    }
}
