package com.umesh.numbers;

public class LowestCommonMultiple {
    public static int LCM(int n1, int n2) {
        int i = 1;
        int maxNumber = Math.max(n1, n2);

        do {
            int multiple = maxNumber * i;
            if (multiple % n1 == 0 && multiple % n2 == 0) {
                return multiple;
            } else {
                i++;
            }
        } while (i <= n1 * n2);

        return -1;
    }
}
