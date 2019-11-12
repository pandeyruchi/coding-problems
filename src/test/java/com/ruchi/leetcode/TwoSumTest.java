package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    TwoSum obj = new TwoSum();

    @Test
    public void twoSum() {
        int[] input={2,7,11,15};
        int[] output={0,1};
        assertArrayEquals(output,obj.twoSum(input,9));
    }
}