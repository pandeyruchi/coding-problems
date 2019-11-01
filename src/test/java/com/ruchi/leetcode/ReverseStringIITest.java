package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringIITest {
    ReverseStringII obj = new ReverseStringII();

    @Test
    public void reverseStr() {
        assertEquals("bacdfeg",obj.reverseStr("abcdefg",2));
    }
}