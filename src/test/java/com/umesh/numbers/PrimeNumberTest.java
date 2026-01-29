package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PrimeNumberTest {

    @Test
    void testPrime() {
        assertTrue(PrimeNumber.isPrime(13));
    }

    @Test
    void testNotPrime() {
        assertFalse(PrimeNumber.isPrime(12));
    }

    @Test
    void testOne() {
        assertFalse(PrimeNumber.isPrime(1));
    }
}
