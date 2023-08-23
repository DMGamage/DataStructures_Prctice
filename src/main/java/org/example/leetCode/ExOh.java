package org.example.leetCode;
/**
 * Have the function ExOh(str) take the str parameter being passed
 * and return the string true if there is an equal number of x's and o's,
 * otherwise return the string false. Only these two letters
 * will be entered in the string, no punctuation or numbers.
 * For example: if str is "xooxxxxooxo" then the output
 * should return false because there are 6 x's and 5 o's.
 */

public class ExOh {
    private String checkBalance(String str){
        int balance =0;
        for(String chr:str.split("")){
            switch (chr){
                case "x":
                    balance++;
                    break;
                case "o":
                    balance--;
                    break;

            }
        }
        return balance==0 ? "true":"false";

    }

}
