package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressionTest {
    StringCompression obj = new StringCompression();

    @Test
    public void compress() {
        assertEquals(6, obj.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        assertEquals(1, obj.compress(new char[]{'a'}));
        assertEquals(4, obj.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
        assertEquals(6, obj.compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'}));
        assertEquals(6, obj.compress(new char[]{'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c'}));
        assertEquals(3, obj.compress(new char[]{'a', 'a', 'a', 'a', 'a', 'b'}));
        assertEquals(3, obj.compress(new char[]{'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'}));
    }
}