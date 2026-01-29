package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    void testFactorialOfFive() {
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, Factorial.factorial(1));
    }
}
