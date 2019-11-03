package com.ruchi.leetcode;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] heightsNotSorted = heights.clone();
        int count = 0;
        Arrays.sort(heightsNotSorted);
        for(int i=0;i<heights.length;i++)
        {
            if(heightsNotSorted[i] != heights[i])
            {
                count++;
            }
        }

        return  count;
    }
}
