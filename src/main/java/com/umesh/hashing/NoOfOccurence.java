package com.umesh.hashing;

import java.util.*;

public class NoOfOccurence {

    public static int noOfOccurence(int[] arr, int num) {

        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.println("Please Enter Elements in Array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        int[] hash = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        if (num > max) {
            return 0;
        }

        return hash[num];
    }
}