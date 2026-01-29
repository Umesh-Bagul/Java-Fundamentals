package com.umesh.numbers;

public class CountOddDigits {
    public static int countOddDigit(int n) {
        int odd = 0;
        int last_digit = 0;
        while (n > 0) {
            last_digit = n % 10;
            if (last_digit % 2 == 1) {
                odd++;
            }
            n = n / 10;
        }
        return odd;
    }
}
