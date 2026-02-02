package com.umesh.arrays;

public class SortedOrNot {
    public static boolean sortedOrNot(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i + 1; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
