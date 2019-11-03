package com.ruchi.leetcode;

public class AddString {
    public String addStrings(String num1, String num2) {

        return (num1+num2).replace("00","0");
    }

    private boolean isInteger(String num1, String num2) {
        return num1.matches("[0-9]") && num2.matches("[0-9]]");
    }
}
