package com.umesh;

import com.umesh.patterns.*;

public class PatternRunner {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        System.out.println("Pattern 1 :");
        p.pattern1(5);
        System.out.println("Pattern 2 :");
        p.pattern2(10);
        System.out.println("Pattern 3 :");
        p.pattern3(5);
        System.out.println("Pattern 4 :");
        p.pattern4(5);
        System.out.println("Pattern 5 :");
        p.pattern5(10);
        System.out.println("Pattern 6 :");
        p.pattern6(10);
        System.out.println("Pattern 7 :");
        p.pattern7(5);
        System.out.println("Pattern 8 :");
        p.pattern8(5);
        System.out.println("Pattern 9 :");
        p.pattern9(5);

        PatternII pI = new PatternII();
        System.out.println("Pattern 1 : ");
        pI.patternA(4);
        System.out.println("Pattern 2 : ");
        pI.patternB(4);
        System.out.println("Pattern 3 : ");
        pI.patternC(4);
        System.out.println("Pattern 4 : ");
        pI.patternD(4);
        System.out.println("Pattern 5 : ");
        pI.patternE(4);
        System.out.println("Pattern 6 : ");
        pI.patternF(10);
        System.out.println("Pattern 7 : ");
        pI.patternG(10);

    }
}
