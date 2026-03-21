package com.umesh.hashing;

public class SumOfHighestAndLowestFrequency {
    public static int sum(int[] arr) {

        int minFreq = arr.length;
        int maxFreq = 0;

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int freq = 0;

            if (visited[i] == true) {
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    freq++;
                    visited[j] = true;
                }
            }
            minFreq = Math.min(minFreq, freq);
            maxFreq = Math.max(maxFreq, freq);
        }

        return minFreq + maxFreq;
    }
}
