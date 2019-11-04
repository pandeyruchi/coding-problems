package com.ruchi.leetcode;

import java.util.Arrays;

///You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
//
//The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//Example 1:
//
//Input: J = "aA", S = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: J = "z", S = "ZZ"
//Output: 0
//Note:
//
//S and J will consist of letters and have length at most 50.
//The characters in J are distinct.
public class JewelsStones {
    public int numJewelsInStones(String J, String S) {
        char[] jewel = J.toCharArray();
        char[] stones = S.toCharArray();
        int count=0;

        for(int i=0;i<stones.length;i++)
        {
           for(int j=0;j<jewel.length;j++)
           {
               if(stones[i]==jewel[j])
               {
                   count++;
               }
           }
        }
        return count;
    }
}
