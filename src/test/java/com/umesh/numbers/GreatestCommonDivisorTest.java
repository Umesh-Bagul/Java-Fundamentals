package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GreatestCommonDivisorTest {

    @Test
    void testGCDNormal() {
        assertEquals(6, GreatestCommonDivisor.GCD(54, 24));
    }

    @Test
    void testGCDSameNumbers() {
        assertEquals(10, GreatestCommonDivisor.GCD(10, 10));
    }

    @Test
    void testGCDOneIsZero() {
        assertEquals(5, GreatestCommonDivisor.GCD(5, 0));
    }
}
