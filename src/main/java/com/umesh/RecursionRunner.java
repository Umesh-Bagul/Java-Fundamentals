package com.umesh;

import com.umesh.recursion.*;

public class RecursionRunner {
    public static void main(String[] args) {
        System.out.println("The Sum of Natural numbers using head recursion : " + SumOfN.sum(50));

        System.out.println("The Sum of Natural numbers using tail recursion : " + SumOfN.add(5, 0));

        System.out.println("The Factorial using head recursion : " + Factorial.fact(6));

        System.out.println("The Factorial using tail recursion : " + Factorial.facto(6, 1));

        int[] a = { 4, 6, 7, 8 };
        System.out.println("The Sum of Array usin tail recursion : " + SumOfArray.sum(a, 0, 0));

        int[] b = { 12, 14, 16, 18 };
        System.out.println("The Sum of Array using head recursion is : " + SumOfArray.suma(b, 0));

        System.out.println("The String is Plaindrome or Not : " + StringPalindrome.isPalindrome("Hello"));

        System.out.println("The Number is Prime or Not : " + PrimeNumber.isPrime(13));

        int[] d = { 100, 200, 300, 400, 500 };
        System.out.println("The Reversed Array is : " + ReverseAnArray.reverseArray(d));
    }
}
