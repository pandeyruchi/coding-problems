package com.ruchi.leetcode;

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i = i + k + k) {
            getReverse(chars, i, Math.min(i+k,chars.length)-1);
        }
        return String.valueOf(chars);
    }

    private void getReverse(char[] chars, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }
}
