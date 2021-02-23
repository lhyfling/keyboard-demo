package com.lhy.keyboard;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Implementing the keyboard simulator
 * @Author lianghanyuan
 * @Date 2021/2/23  15:04
 * @Version 1.0
 **/
class Solution {
    /**
     * Combined numeric character
     * @param digits
     * @return
     */
    public List<String> letterCombinations(int[] digits) {
        if(digits==null || digits.length==0) {
            return new ArrayList<String>();
        }

        List<String> resp = new ArrayList();
        //Start by adding a null character to the queue
        resp.add("");
        for(int i=0;i<digits.length;i++) {
            //By the current traversal to the character, fetch the dictionary table to find the corresponding string
            String letters;
            // Support from 0 to 99
            int curDigit = digits[i];
            //Three-digit numbers are not supported
            if (curDigit>99){
                return new ArrayList<String>();
            }
            if (curDigit>9 && curDigit<=99){
                int g = (curDigit/1)%10;
                int s = (curDigit/10)%10;
                letters = Constant.letter_map[s] + Constant.letter_map[g];
            }else{
                letters = Constant.letter_map[digits[i]];
            }

            int size = resp.size();
            //Once the length of the queue has been calculated, each element in the queue is taken out one by one
            for(int j=0;j<size;j++) {
                //Every time take the first element out of the queue
                String tmp = resp.remove(0);
                //Concatenation and put into the queue again
                for(int k=0;k<letters.length();k++) {
                    resp.add(tmp+letters.charAt(k));
                }
            }
        }
        return resp;
    }
}

