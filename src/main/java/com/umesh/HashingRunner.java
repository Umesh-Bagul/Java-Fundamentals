package com.umesh;

import com.umesh.hashing.*;

public class HashingRunner {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // System.out.println("The Number Of Time 6 Occurs is " + n.noOfOccurence(arr,
        // 6));
        System.out.println("The Number Of Time 100 Occurs is : " + NoOfOccurence.noOfOccurence(arr, 100));

        System.out.println(
                "The Number Occured Most Times in an Array is : " + HighestNoOfOccurence.mostFrequentElement(arr));

        System.out.println("The Number Occured Second Most Times in an Array is : "
                + SecondHighestNoOfOccurenece.secondHighFrequency(arr));

        System.out.println("The Sum Of Highest and Lowest Frequency is : "
                + SumOfHighestAndLowestFrequency.sum(arr));
    }
}
