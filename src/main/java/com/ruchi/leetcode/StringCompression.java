package com.ruchi.leetcode;

import java.util.ArrayList;
import java.util.List;

///Given an array of characters, compress it in-place.
//
//The length after compression must always be smaller than or equal to the original array.
//
//Every element of the array should be a character (not int) of length 1.
//
//After you are done modifying the input array in-place, return the new length of the array.
//
//
//Follow up:
//Could you solve it using only O(1) extra space?
//
//
//Example 1:
//
//Input:
//["a","a","b","b","c","c","c"]
//
//Output:
//Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
//
//Explanation:
//"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
//
//
//Example 2:
//
//Input:
//["a"]
//
//Output:
//Return 1, and the first 1 characters of the input array should be: ["a"]
//
//Explanation:
//Nothing is replaced.
//
//
//Example 3:
//
//Input:
//["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//
//Output:
//Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
//
//Explanation:
//Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
//Notice each digit has it's own entry in the array.
//
//
//Note:
//
//All characters have an ASCII value in [35, 126].
//1 <= len(chars) <= 1000.
public class StringCompression {
    public int compress1(char[] chars) {
        int count = 0;
        char temp = chars[0];
        int old = 0;

        for (int i = 0; i < chars.length; i++) {
            {
                if (chars[i] == temp) {
                    count++;
                    if (count == 2) {
                        old = i;
                        chars[i] = (char) (count + '0');
                    } else if (count > 2 && count < 10) {
                        chars[old] = (char) (count + '0');
                        chars[i] = '!';
                    } else if (count >= 10) {
                        String number = String.valueOf(count);
                        char[] digits1 = number.toCharArray();
                        chars[old] = digits1[0];
                        for (int j = 1; j < digits1.length; j++) {
                            chars[old + 1] = digits1[j];
                        }
                        chars[i] = '!';
                    }
                } else {
                    temp = chars[i];
                    count = 1;
                }
            }
        }
        String s = String.valueOf(chars);
        String newStr = s.replaceAll("!", "");
        pushZerosToEnd(chars);
        return newStr.length();
    }


    public int compress(char[] chars) {
        int finalLength = 0;
        for (int i = 0; i < chars.length; ) {
            char current = chars[i];
            int count = 1;
            int j = i + 1;
            while ( j < chars.length && chars[j] == current) {
                count++;
                chars[j] = '!';
                j++;
            }
            if (count > 1) {
                char[] countAsString = String.valueOf(count).toCharArray();
                for (int k = 0, l = i + 1; k < countAsString.length; k++, l++) {
                    chars[l] = countAsString[k];
                    finalLength++;
                }
            }
            i = i + count;
            finalLength++;
        }
        pushZerosToEnd(chars);
        return finalLength;
    }


    private void pushZerosToEnd(char[] chars) {
        int count = 0;  // Count of non-zero elements

        for (int i = 0; i < chars.length; i++)
            if (chars[i] != '!')
                chars[count++] = chars[i]; // here count is

        while (count < chars.length)
            chars[count++] = '!';
    }
}


/// int count = 0;
//        char temp = chars[0];
//        int old = 0;
//
//        for (int i = 0; i < chars.length; i++) {
//            {
//                if (chars[i] == temp) {
//                    count++;
//                    if (count == 2) {
//                        old = i;
//                        chars[i] = (char) (count + '0');
//                    } else if (count > 2 && count < 10) {
//                        chars[old] = (char) (count + '0');
//                        chars[i] = '!';
//                    } else if (count >= 10) {
//                        String number = String.valueOf(count);
//                        char[] digits1 = number.toCharArray();
//                        chars[old] = digits1[0];
//                        for (int j = 1; j < digits1.length; j++) {
//                            chars[old + 1] = digits1[j];
//                        }
//                        chars[i] = '!';
//                    }
//                } else {
//                    temp = chars[i];
//                    count = 1;
//                }
//            }
//        }
//        String s = String.valueOf(chars);
//        String newStr = s.replaceAll("!", "");
//        pushZerosToEnd(chars);
//        return newStr.length();
//    }
//
//    private void pushZerosToEnd(char[] chars) {
//        int count = 0;  // Count of non-zero elements
//
//        // Traverse the array. If element encountered is
//        // non-zero, then replace the element at index 'count'
//        // with this element
//        for (int i = 0; i < chars.length; i++)
//            if (chars[i] != '!')
//                chars[count++] = chars[i]; // here count is
//        // incremented
//
//        // Now all non-zero elements have been shifted to
//        // front and 'count' is set as index of first 0.
//        // Make all elements 0 from count to end.
//        while (count < chars.length)
//            chars[count++] = '!';
//    }


///*****************************************
///   int[] array = new int[256];
//        for (int i = 0; i < chars.length; i++) {
//            array[chars[i]] += 1;
//        }
//        int result = 0;
//        for (int i = 0; i < array.length; i++) {
//            int count = array[i];
//            if (count == 0) {
//                continue;
//            } else if (count == 1) {
//                result += 1;
//            } else {
//                result += (count + "").length() + 1;
//            }
//        }
//
//        return result;
