package com.ruchi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelReverse {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ) {
            boolean c1 = isVowel(chars[i]);
            boolean c2 = isVowel(chars[j]);
            if (c1 && c2) {
                swap(chars, i, j);
                i++;
                j--;
            } else if (c1) {
                j--;
            } else if (c2) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }

    private boolean isVowel(Character c) {
        return c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
    }
}