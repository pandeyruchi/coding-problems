package com.ruchi.leetcode;

public class AddString {
    public String addStrings(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        return strToInt(num1) +strToInt(num2)+ "";
    }

    private long strToInt(String num) {
        char[] chars = num.toCharArray();
        long result = 0;
        for (int i = 0; i < chars.length; i++) {
            result= result*10+ charToInt(chars[i]);
        }
        return result;
    }

    private int charToInt(char c) {
        if(c == '0')return 0;
        if(c == '1')return 1;
        if(c == '2')return 2;
        if(c == '3')return 3;
        if(c == '4')return 4;
        if(c == '5')return 5;
        if(c == '6')return 6;
        if(c == '7')return 7;
        if(c == '8')return 8;
        if(c == '9')return 9;
        throw new IllegalArgumentException("Not a integer");
    }
}
