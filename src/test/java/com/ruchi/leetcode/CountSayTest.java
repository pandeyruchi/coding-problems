package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountSayTest {

    CountSay obj = new CountSay();
    @Test
    public void countAndSay() {
        assertEquals("1",obj.countAndSay(1));
        assertEquals("1211",obj.countAndSay(4));
        assertEquals("312211",obj.countAndSay(6));
    }
}