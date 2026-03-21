package com.umesh.recursion;

public class Factorial {

    // Head Recursion
    public static int fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n - 1);
    }

    // Tail Recursion
    public static int facto(int n, int fac) {
        if (n <= 1) {
            return fac;
        }

        return facto(n - 1, fac * n);
    }
}
