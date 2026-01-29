package com.umesh;

import com.umesh.numbers.*;

public class NumberRunner {

        public static void main(String[] args) {

                int num = 153;
                int num2 = 28;
                int num3 = 121;
                int num4 = 12345;
                int a = 12, b = 18;

                // Armstrong Number
                System.out.println("Is Armstrong (" + num + "): "
                                + ArmstrongNumber.isArmstrong(num));

                // Count Digits
                System.out.println("Count Digits (" + num4 + "): "
                                + CountDigits.countDigit(num4));

                // Count Odd Digits
                System.out.println("Count Odd Digits (" + num4 + "): "
                                + CountOddDigits.countOddDigit(num4));

                // Factorial
                System.out.println("Factorial (5): "
                                + Factorial.factorial(5));

                // GCD / Greatest Common Divisor
                System.out.println("GCD (" + a + ", " + b + "): "
                                + GreatestCommonDivisor.GCD(a, b));

                // LCM / Lowest Common Multiple
                System.out.println("LCM (" + a + ", " + b + "): "
                                + LowestCommonMultiple.LCM(a, b));

                // Largest Digit
                System.out.println("Largest Digit (" + num4 + "): "
                                + LargestDigit.largestDigit(num4));

                // Palindrome Number
                System.out.println("Is Palindrome (" + num3 + "): "
                                + PalindromeNumber.isPalindrome(num3));

                // Perfect Number
                System.out.println("Is Perfect (" + num2 + "): "
                                + PerfectNumber.isPerfect(num2));

                // Prime Number
                System.out.println("Is Prime (17): "
                                + PrimeNumber.isPrime(17));

                // Count Primes Till N
                System.out.println("Count Primes till 50: "
                                + PrimeNumbersTillN.primeUptoN(50));
        }
}
