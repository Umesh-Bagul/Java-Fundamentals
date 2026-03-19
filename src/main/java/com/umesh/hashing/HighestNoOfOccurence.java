package com.umesh.hashing;

public class HighestNoOfOccurence {
    public static int mostFrequentElement(int[] nums) {
        int maxElement = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }
        int[] hash = new int[maxElement + 1];

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        int maxCount = -1;
        int element = -1;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > maxCount) {
                maxCount = hash[i];
                element = i;
            }
        }
        return element;
    }
}
