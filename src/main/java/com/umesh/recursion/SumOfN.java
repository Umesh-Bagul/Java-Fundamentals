package com.umesh.recursion;

public class SumOfN {
    // Head Recursion
    public static int sum(int N) {
        if (N == 0) {
            return 0;
        }

        return N + sum(N - 1);
    }

    // Tail Recursion
    public static int add(int N, int addi) {
        if (N == 0) {
            return addi;
        }
        return add(N - 1, addi + N);
    }
}
