package com.umesh.hashing;

import java.util.*;

public class CharHashing {

    public static int countOccur(char[] arr, char ch) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Character Elements in Array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        int[] hash = new int[256];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        return hash[ch];
    }

    public static void main(String[] args) {
        char[] arr = new char[5];
        System.out.println("Count is: " + countOccur(arr, 'a'));
    }
}