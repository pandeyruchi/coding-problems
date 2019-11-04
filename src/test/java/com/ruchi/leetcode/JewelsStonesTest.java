package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsStonesTest {

    JewelsStones obj = new JewelsStones();
    @Test
    public void numJewelsInStones() {
        assertEquals(3,obj.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0,obj.numJewelsInStones("z","ZZ"));
    }
}