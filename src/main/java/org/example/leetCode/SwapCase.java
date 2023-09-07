package org.example.leetCode;
/**
 * Have the function SwapCase(str) take the str parameter
 * and swap the case of each character.
 * For example: if str is "Hello World" the output should be hELLO wORLD.
 * Let numbers and symbols stay the way they are.
 */

public class SwapCase {
    private static String swapCase(String str){
        StringBuilder out = new StringBuilder();
        char[] charcters = str.toCharArray();
        for(char c :charcters){
            if (Character.isLowerCase(c)){
                out.append(Character.toUpperCase(c));
            }else{
                out.append(Character.toLowerCase(c));
            }
        }
        return out.toString();
    }
}
