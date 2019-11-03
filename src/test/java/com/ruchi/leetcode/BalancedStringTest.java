package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedStringTest {
    BalancedString obj = new BalancedString();
    @Test
    public void balancedStringSplit() {
        assertEquals(4,obj.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(3,obj.balancedStringSplit("RLLLLRRRLR"));
        assertEquals(1,obj.balancedStringSplit("LLLLRRRR"));
    }
}