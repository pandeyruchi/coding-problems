package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringIITest {
    ReverseStringII obj = new ReverseStringII();

    @Test
    public void reverseStr() {
        assertEquals("bacdfeghjikl",obj.reverseStr("abcdefghijkl",2));
        assertEquals("gfedcba",obj.reverseStr("abcdefg",8));
    }
}