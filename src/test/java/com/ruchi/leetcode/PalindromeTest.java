package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome obj =new Palindrome();
    @Test
    public void checkPalindrome() {
        assertEquals(true,obj.checkPalindrome("NOON"));
        assertEquals(false,obj.checkPalindrome("NOAN"));
        assertEquals(false,obj.checkPalindrome("MORNING"));

    }
}