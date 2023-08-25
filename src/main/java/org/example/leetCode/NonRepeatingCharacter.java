package org.example.leetCode;

import java.util.HashMap;

/**
 * Have the function NonrepeatingCharacter(str)
 * take the str parameter being passed,
 * which will contain only alphabetic characters and spaces,
 * and return the first non-repeating character.
 * ---
 * For example: if str is "agettkgaeee" then your program should return k.
 * The string will always contain at least one character and there will
 * always be at least one non-repeating character.
 */

public class NonRepeatingCharacter {
    private static String nonRepeatingCharacter(String str){
        char[] chr= str.toLowerCase().toCharArray();
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int c : chr){
            Integer count = hash.get(c);
            hash.put( c,count==null ? 1:++count);


        }
        for(int c :chr){
            Integer count = hash.get(c);
            if(count==1){
                return  String.valueOf(c);
            }



        }
        return "false";

    }

}
