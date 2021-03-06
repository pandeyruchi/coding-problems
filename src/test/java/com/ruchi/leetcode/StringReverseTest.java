package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {

    StringReverse obj = new StringReverse();

    @Test
    public void reverse() {
        assertEquals("abcdefg", obj.reverse("gfedcba"));
        assertEquals("ZAAAabcdefg", obj.reverse("gfedcbaAAAZ"));
        assertEquals("abcdefg%iop", obj.reverse("poi%gfedcba"));
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, obj.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'}));
    }
}

