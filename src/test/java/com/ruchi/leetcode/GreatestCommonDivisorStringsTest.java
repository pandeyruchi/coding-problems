package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreatestCommonDivisorStringsTest {
    GreatestCommonDivisorStrings obj = new GreatestCommonDivisorStrings();

    @Test
    public void gcdOfStrings() {
        assertEquals("ABC", obj.gcdOfStrings("ABCABC", "ABC"));
        assertEquals("AB", obj.gcdOfStrings("ABABAB", "ABAB"));
        assertEquals("", obj.gcdOfStrings("LEET", "CODE"));
        assertEquals("TAUXX", obj.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX",
                "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
        String A = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        assertEquals(A, obj.gcdOfStrings(A, A));
    }
}