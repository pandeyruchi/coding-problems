package com.ruchi.leetcode;

import static org.junit.Assert.*;

public class ToLowerCaseTest {

    ToLowerCase obj = new ToLowerCase();

    @org.junit.Test
    public void toLowerCase() {

        assertEquals("rahul",obj.toLowerCase("RAHul"));
        assertEquals("rahulaaazzzz",obj.toLowerCase("RAHulAAAZZZZ"));
        assertEquals("rahul%",obj.toLowerCase("RAHul%"));
        assertEquals("al&phabet",obj.toLowerCase("al&phaBET"));

    }
}