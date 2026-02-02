package com.umesh.arrays;

public class CountOdd {
    public static int oddCount(int arr[], int n) {
        int Count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                Count++;
            }
        }
        return Count;
    }
}
