package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeNumbersTillNTest {

    @Test
    void testPrimeUptoTen() {
        assertEquals(4, PrimeNumbersTillN.primeUptoN(10));
    }

    @Test
    void testPrimeUptoOne() {
        assertEquals(0, PrimeNumbersTillN.primeUptoN(1));
    }

    @Test
    void testPrimeUptoTwenty() {
        assertEquals(8, PrimeNumbersTillN.primeUptoN(20));
    }
}
