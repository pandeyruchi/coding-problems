package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class IPAddressTest {

    IPAddress obj = new IPAddress();
    @Test
    public void defangIPaddr() {
        assertEquals("1[.]1[.]1[.]1",obj.defangIPaddr("1.1.1.1"));
    }
}