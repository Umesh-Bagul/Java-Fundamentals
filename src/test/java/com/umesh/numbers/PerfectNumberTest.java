package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PerfectNumberTest {

    @Test
    void testPerfectNumber() {
        assertTrue(PerfectNumber.isPerfect(6));
    }

    @Test
    void testNonPerfectNumber() {
        assertFalse(PerfectNumber.isPerfect(10));
    }
}
