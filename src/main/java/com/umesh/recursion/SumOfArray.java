package com.umesh.recursion;

public class SumOfArray {
    // Tail Recursion
    public static int sum(int[] n, int left, int summation) {
        if (left == n.length) {
            return summation;
        }

        return sum(n, left + 1, summation + n[left]);
    }

    // Head Recursion
    public static int suma(int[] n, int left) {
        if (left == n.length) {
            return 0;
        }

        return n[left] + suma(n, left + 1);
    }
}
