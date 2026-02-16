package com.umesh;

import com.umesh.strings.*;

public class StringsRunner {
    public static void main(String[] args) {
        System.out.println("is Umesh a Palindrome   :" + PalindromeChk.PalindromeCheck("Umesh"));
        System.out.println("is Oppo a Palindrome    :" + PalindromeChk.PalindromeCheck("Oppo"));
        System.out.println("is Reviver a Palindrome :" + PalindromeChk.PalindromeCheck("Reviver"));

        System.out.println("Largest Odd Number From String is :" + LargestOddNumber.LargeOddNum("5246456459"));
        System.out.println("Largest Odd Number From String is :" + LargestOddNumber.LargeOddNum("24682468"));
    }
}
