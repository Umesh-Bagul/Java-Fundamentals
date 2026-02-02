package com.umesh.arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr, int n) {
        for (int i = 0; i <= n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.print("The Reversed Array is : ");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void reverseArr(int[] arr, int n) { // This Method is not preferred because it has more Time
                                                      // Complexity.
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[n - 1 - i] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        System.out.print("The Array After Reversing Again : ");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

    }
}
