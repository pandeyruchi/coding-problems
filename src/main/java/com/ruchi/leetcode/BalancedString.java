package com.ruchi.leetcode;

public class BalancedString {
    public int balancedStringSplit(String s) {
        char[] chars = s.toCharArray();
        int count=0,newCount =0;
        for (int i = 0; i < chars.length; i++) {
           if(chars[i]=='R')
           {
               count++;
           }
           else
           {
               count--;
           }
           if(count==0)
           {
               newCount++;
           }
        }
        return newCount;
    }
}
