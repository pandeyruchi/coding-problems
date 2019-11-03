package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddStringTest {
    AddString obj = new AddString();

    @Test
    public void addStrings() {
        assertEquals("0", obj.addStrings("0", "0"));
        assertEquals("123", obj.addStrings("122", "1"));
        assertEquals("6984362587",obj.addStrings("6913259244","71103343"));
        assertEquals("10405985147604178950",obj.addStrings("3876620623801494171","6529364523802684779"));

    }

}