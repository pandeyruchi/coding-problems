package com.ruchi.leetcode;

public class ToLowerCase {
    public String toLowerCase(String str) {
        StringBuilder newstr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) < 97) {
                newstr.append((char)(str.charAt(i) + 32));
            } else
                newstr.append(str.charAt(i));
        }

        return newstr.toString();
    }
}
