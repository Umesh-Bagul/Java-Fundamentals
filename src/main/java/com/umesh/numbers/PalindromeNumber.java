package com.umesh.numbers;

public class PalindromeNumber {
    public static int reverseNumber(int n) {
        int revno = 0;
        int last_digit = 0;

        while (n > 0) {
            last_digit = n % 10;
            revno = revno * 10 + last_digit;
            n = n / 10;
        }
        return revno;
    }

    public static boolean isPalindrome(int n) {
        int number = reverseNumber(n);
        return number == n;
    }
}
