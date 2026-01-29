package com.umesh.numbers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArmstrongNumberTest {

    @Test
    void testArmstrongTrue() {
        assertTrue(ArmstrongNumber.isArmstrong(153));
    }

    @Test
    void testArmstrongFalse() {
        assertFalse(ArmstrongNumber.isArmstrong(123));
    }
}
