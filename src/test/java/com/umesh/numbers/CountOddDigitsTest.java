package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CountOddDigitsTest {

    @Test
    void testMixedDigits() {
        assertEquals(3, CountOddDigits.countOddDigit(13524));
    }

    @Test
    void testNoOddDigits() {
        assertEquals(0, CountOddDigits.countOddDigit(2468));
    }

    @Test
    void testAllOddDigits() {
        assertEquals(4, CountOddDigits.countOddDigit(1357));
    }
}
