package com.ruchi.leetcode;

import java.util.HashMap;
import java.util.Map;

///The count-and-say sequence is the sequence of integers with the first five terms as following:
//
//1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
//1 is read off as "one 1" or 11.
//11 is read off as "two 1s" or 21.
//21 is read off as "one 2, then one 1" or 1211.
//
//Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
//
//Note: Each term of the sequence of integers will be represented as a string.
//
//
//
//Example 1:
//
//Input: 1
//Output: "1"
//Example 2:
//
//Input: 4
//Output: "1211"
public class CountSay {
    public String countAndSay(int n) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "1");

        createMap(map,n);

        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            throw new IllegalArgumentException();
        }


    }

    private static void createMap(Map<Integer, String> map, int n) {
        for (int i = 1; i < n; i++) {
            if (map.containsKey(i)) {
                char[] values = map.get(i).toCharArray();
                StringBuilder str = new StringBuilder();
                for (int k = 0; k < values.length;) {
                    char current = values[k];
                    int count = 1;
                    int j = k + 1;
                    while (j < values.length && current == values[j]) {
                        count++;
                        j++;
                    }
                    if (count >= 1) {
                        str.append(String.valueOf(count) + String.valueOf(values[k]));
                    }
                    k = k + count;
                }
                map.put(i+1, str.toString());
            }
        }
    }
}
