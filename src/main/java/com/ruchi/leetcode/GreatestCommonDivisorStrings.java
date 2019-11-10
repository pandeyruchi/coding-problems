package com.ruchi.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

///For strings S and T, we say "T divides S" if and only if S = T + ... + T  (T concatenated with itself 1 or more times)
//
//Return the largest string X such that X divides str1 and X divides str2.
//
//
//
//Example 1:
//
//Input: str1 = "ABCABC", str2 = "ABC"
//Output: "ABC"
//Example 2:
//
//Input: str1 = "ABABAB", str2 = "ABAB"
//Output: "AB"
//Example 3:
//
//Input: str1 = "LEET", str2 = "CODE"
//Output: ""
//
//
//Note:
//
//1 <= str1.length <= 1000
//1 <= str2.length <= 1000
//str1[i] and str2[i] are English uppercase letters.
public class GreatestCommonDivisorStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length())
            return gcdOfStrings(str2, str1);
        if (str2.length() == 0)
            return str1;
        return str1.startsWith(str2) ? gcdOfStrings(str2, str1.substring(str2.length())) : "";
    }
    public String gcdOfStrings1(String str1, String str2) {
        String gcd = "";
        if (str2.equals(str1)) {
            gcd = str2;
        } else if (str2.length() > str1.length()) {
            if (str1.contains(str2.substring(0, str1.length()))) {
                String sub = str2.substring(0, str1.length());
                String newStr = sub;
                gcd = sub;
                while (newStr.length() <= str1.length()) {
                    newStr += sub;
                    if (newStr.equals(str1)) {
                        gcd = sub;
                    } else {
                        for (int i = 2; i <= str2.length(); i++) {
                            String newStr1 = str2.substring(0, i);
                            String X = "";
                            while (X.length() <= str1.length() && str1.contains(X)) {
                                gcd = newStr1;
                                X += newStr1;
                                if (X.equals(str1)) {
                                    break;
                                } else {
                                    gcd = "";
                                }
                            }
                            if (X.equals(str1)) {
                                break;
                            }
                        }
                    }
                }
            }

        } else {
            for (int i = 2; i <= str2.length(); i++) {
                String newStr1 = str2.substring(0, i);
                String X = "";
                while (X.length() <= str1.length() && str1.contains(X)) {
                    gcd = newStr1;
                    X += newStr1;
                    if (X.equals(str1)) {
                        break;
                    } else {
                        gcd = "";
                    }
                }
                if (X.equals(str1)) {
                    break;
                }
            }
        }

        return gcd;
    }

    public String gcdOfStrings2(String str1, String str2) {
        StringBuilder gcd = new StringBuilder();
        if (str2.equals(str1)) {
            return str2;
        }

        String small = str1.length() > str2.length() ? str2 : str1;
        char[] big = str1.length() > str2.length() ? str1.toCharArray() : str2.toCharArray();

        List<String> d1 = getDivisors(small);

        for (int i = d1.size() - 1; i >= 0; i--) {
            if(isDivisor(d1.get(i).toCharArray(),big)){
                return d1.get(i);
            }
        }
        return "";
    }

    private List<String> getDivisors(String str1) {
        List<String> divisors = new ArrayList<>();
        char[] chars = str1.toCharArray();
        for (int i = 1; i <= str1.length(); i++) {
            String subs = str1.substring(0, i);
            if (isDivisor(subs.toCharArray(), chars)) {
                divisors.add(subs);
            }
        }
        return divisors;
    }

    private boolean isDivisor(char[] divisor, char[] str) {
        for (int i = 0; i < str.length; i = i + divisor.length) {
            for (int j = 0; j < divisor.length; j++) {
                if (i + j >= str.length || str[i + j] != divisor[j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
