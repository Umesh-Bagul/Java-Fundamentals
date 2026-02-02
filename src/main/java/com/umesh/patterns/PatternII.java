package com.umesh.patterns;

public class PatternII {
    public void patternA(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public void patternB(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public void patternC(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 65; j < 65 + i; j++) {
                char ch = (char) j;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void patternD(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 65; j <= 65 + n - i; j++) {
                char ch = (char) j;
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void patternE(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 65; k < 65 + i; k++) {
                char ch = (char) k;
                System.out.print(ch);
            }
            for (int l = 65 + i; l >= 65; l--) {
                char c = (char) l;
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void patternF(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= n - i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void patternG(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * i; k++) {
                System.out.print(" ");
            }
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
