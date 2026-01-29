package com.umesh.numbers;

public class LargestDigit {
    public static int largestDigit(int n) {
        int last_digit = 0;
        int largestDigit = 0;
        while (n > 0) {
            last_digit = n % 10;
            if (largestDigit < last_digit)
                largestDigit = last_digit;
            n = n / 10;
        }
        return largestDigit;
    }
}
