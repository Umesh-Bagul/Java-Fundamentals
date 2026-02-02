package com.umesh;

import com.umesh.arrays.*;
import java.util.*;

public class ArrayRunner {
    public static void main(String[] args) {
        System.out.println("Please Enter The Size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Sum of all elements of array is " + SumOfArrays.sum(arr, n));
        sc.close();
    }
}
