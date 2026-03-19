package com.umesh.hashing;

public class SecondHighestNoOfOccurenece {
    public static int secondHighFrequency(int[] arr) {
        int maxElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        int[] hash = new int[maxElement + 1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        int maxCount = 0;
        int secondMaxCount = 0;
        int mostOccuredElement = -1;
        int secondMostOccuredElement = -1;

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > maxCount) {
                secondMaxCount = maxCount;
                maxCount = hash[i];
                secondMostOccuredElement = mostOccuredElement;
                mostOccuredElement = i;
            }
            if (hash[i] > secondMaxCount && maxCount != hash[i]) { 
                secondMaxCount = hash[i];
                secondMostOccuredElement = i;
            }
        }
        return secondMostOccuredElement;
    }
}
