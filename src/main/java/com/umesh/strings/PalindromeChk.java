package com.umesh.strings;

import java.util.*;

public class PalindromeChk {
    public static Boolean PalindromeCheck(String s) {
        String ss = s.toLowerCase();
        for (int i = 0; i < s.length() / 2; i++) {
            if (ss.charAt(i) != ss.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
