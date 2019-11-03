package com.ruchi.leetcode;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = heights.clone();
        int count = 0;
        Arrays.sort(sortedHeights);
        for(int i=0;i<heights.length;i++)
        {
            if(sortedHeights[i] != heights[i])
            {
                count++;
            }
        }

        return  count;
    }
}
