package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LowestCommonMultipleTest {

    @Test
    void testLCMNormal() {
        assertEquals(12, LowestCommonMultiple.LCM(3, 4));
    }

    @Test
    void testLCMSameNumbers() {
        assertEquals(10, LowestCommonMultiple.LCM(10, 10));
    }

    @Test
    void testLCMWithOne() {
        assertEquals(7, LowestCommonMultiple.LCM(1, 7));
    }
}
