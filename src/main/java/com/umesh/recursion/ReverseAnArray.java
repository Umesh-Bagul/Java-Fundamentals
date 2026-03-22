package com.umesh.recursion;

public class ReverseAnArray {
    public static int[] reverseArray(int[] nums) {

        reversedArray(nums, 0, nums.length - 1);
        return nums;
    }

    private static void reversedArray(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        reversedArray(nums, left + 1, right - 1);
    }
}
