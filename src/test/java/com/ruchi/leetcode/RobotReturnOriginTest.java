package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotReturnOriginTest {
    RobotReturnOrigin obj = new RobotReturnOrigin();
    @Test
    public void judgeCircle() {
        assertEquals(true,obj.judgeCircle("UD"));
        assertEquals(false,obj.judgeCircle("LL"));
        assertEquals(false,obj.judgeCircle("LDRRLRUULR"));
    }
}