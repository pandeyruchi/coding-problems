package com.ruchi.leetcode;

public class ReverseStringII {
    public String reverseStr(String s, int k) {

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i = i + k + k) {
            str.append(getReverse(s.substring(i, i + k)));
            System.out.println(str);
        }
        return s;
    }

    private String getReverse(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return String.valueOf(chars);
    }

}
