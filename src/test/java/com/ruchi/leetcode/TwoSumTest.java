package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    TwoSum obj = new TwoSum();

    @Test
    public void twoSum() {
        assertArrayEquals(new int[]{0,1},obj.twoSum(new int[]{2,7,11,15},9));
        assertArrayEquals(new int[]{0,1},obj.twoSum(new int[]{3,3},6));
        assertArrayEquals(new int[]{0,2},obj.twoSum(new int[]{3,2,3},6));
    }
}