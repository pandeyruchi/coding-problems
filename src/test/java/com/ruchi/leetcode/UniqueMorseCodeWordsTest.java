package com.ruchi.leetcode;

import org.junit.Test;
import sun.usagetracker.UsageTrackerClient;

import static org.junit.Assert.*;

public class UniqueMorseCodeWordsTest {

    UniqueMorseCodeWords obj = new UniqueMorseCodeWords();

    @Test
    public void uniqueMorseRepresentations() {
        assertEquals(2,obj.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
        assertEquals(1,obj.uniqueMorseRepresentations(new String[]{"a"}));
        assertEquals(1,obj.uniqueMorseRepresentations(new String[]{"rwjje","aittjje","auyyn","lqtktn","lmjwn"}));
    }
}