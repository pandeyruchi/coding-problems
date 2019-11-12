package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumIITest {
    TwoSumII obj = new TwoSumII();

    @Test
    public void twoSum() {
        assertArrayEquals(new int[]{1, 2}, obj.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}