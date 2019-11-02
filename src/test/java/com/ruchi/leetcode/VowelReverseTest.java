package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelReverseTest {

    VowelReverse obj =new VowelReverse();
    @Test
    public void reverseVowels() {
        assertEquals("holle",obj.reverseVowels("hello"));
        assertEquals("leotcede",obj.reverseVowels("leetcode"));
        assertEquals("Aa",obj.reverseVowels("aA"));
    }
}