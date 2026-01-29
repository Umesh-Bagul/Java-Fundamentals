package com.umesh.numbers;

public class ArmstrongNumber {
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int n) {
        if (n == 0)
            return true;
        int counter = count(n);
        int sum = 0;
        int last_digit = 0;
        int copy = n;
        while (n > 0) {
            last_digit = n % 10;
            sum += Math.pow(last_digit, counter);
            n = n / 10;
        }

        return sum == copy;
    }
}
