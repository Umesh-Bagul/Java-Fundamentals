package com.umesh.recursion;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        return checkPrime(num, 2);
    }

    private static boolean checkPrime(int num, int i) {

        if (i > Math.sqrt(num)) {
            return true;
        }

        if (num % i == 0) {
            return false;
        }

        return checkPrime(num, i + 1);
    }
}
