package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeightCheckerTest {
    HeightChecker obj = new HeightChecker();
    @Test
    public void heightChecker() {
         assertEquals(3, obj.heightChecker(new int[]{1,1,4,2,1,3}));
    }
}