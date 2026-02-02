package com.umesh.arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumOfArraysTest {
    @Test
    void testSumOfArrays() {
        int[] arr = { 10, 20, 30, 40, 50 };
        int result = SumOfArrays.sum(arr, 5);
        assertEquals(150, result);
    }
}
