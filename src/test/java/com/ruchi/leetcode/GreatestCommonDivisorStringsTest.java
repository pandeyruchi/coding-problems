package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreatestCommonDivisorStringsTest {
    GreatestCommonDivisorStrings obj = new GreatestCommonDivisorStrings();

    @Test
    public void gcdOfStrings() {
        assertEquals("ABC",obj.gcdOfStrings("ABCABC","ABC"));
    }
}