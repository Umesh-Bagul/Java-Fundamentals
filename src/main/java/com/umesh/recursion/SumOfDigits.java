package com.umesh.recursion;

public class SumOfDigits {

    public static int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        int sum = sumDigits(num);

        return addDigits(sum);
    }

    private static int sumDigits(int num) {
        if (num == 0)
            return 0;

        return (num % 10) + sumDigits(num / 10);
    }
}
