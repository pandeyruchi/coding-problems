package com.ruchi.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueEmailAddressTest {
    UniqueEmailAddress obj = new UniqueEmailAddress();

    @Test
    public void numUniqueEmails() {
        assertEquals(2,obj.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }
}