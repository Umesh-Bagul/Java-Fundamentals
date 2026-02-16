package com.umesh.strings;

public class LargestOddNumber {
    public static String LargeOddNum(String s) {
        int ending_index = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                ending_index = i;
                break;
            }
        }
        if (ending_index == -1) {
            return "";
        }

        int starting_index = 0;
        while (starting_index <= ending_index && s.charAt(starting_index) == '0')
            starting_index++;

        return s.substring(starting_index, ending_index + 1);
    }
}
