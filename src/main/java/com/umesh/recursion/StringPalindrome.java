package com.umesh.recursion;

public class StringPalindrome {
    public static boolean isPalindrome(String s) {
        return checkPalindrome(s, 0, s.length() - 1);
    }

    private static boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (s.charAt(right) != s.charAt(left)) {
            return false;
        }

        return checkPalindrome(s, left + 1, right - 1);
    }
}
