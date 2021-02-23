package com.lhy.keyboard;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @org.junit.Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    /**
     * Test support from 0 to 9
     */
    @org.junit.Test
    public void letterCombinations() {
        int[] digits = {2,3};
        List<String> resp = solution.letterCombinations(digits);
        System.out.println(resp);
    }

    /**
     * Test support from 0 to 99
     */
    @org.junit.Test
    public void twoDigitsLetterCombinations() {
        int[] digits = {2,23,34,99};
        List<String> resp = solution.letterCombinations(digits);
        System.out.println(resp);
    }
}