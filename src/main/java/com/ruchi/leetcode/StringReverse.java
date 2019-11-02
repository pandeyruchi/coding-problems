package com.ruchi.leetcode;

public class StringReverse {
    public String reverse(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            chars[i]= (char)(chars[i]^chars[j]);
            chars[j] = (char)(chars[i]^chars[j]);;
            chars[i] = (char)(chars[i]^chars[j]);;
        }
        return String.valueOf(chars);
    }

    public char[] reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        return s;
    }
}


