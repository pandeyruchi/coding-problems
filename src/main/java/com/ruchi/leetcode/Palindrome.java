package com.ruchi.leetcode;

import javax.sound.midi.Soundbank;

public class Palindrome {
    public Boolean checkPalindrome(String str)
    {
        Boolean result = true;
        char[] chars = str.toCharArray();
        for(int i=0,j=chars.length-1;i<j;i++,j--)
        {
          if(chars[i]==chars[j])
          {
              result =true;
          }
          else
          {
              result =false;
              return result;
          }
        }
        return result;
    }
}
