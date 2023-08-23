package org.example.leetCode;
/**
 * Have the function CamelCase(str) take the str parameter being passed
 * and return it in proper camel case format where the first letter
 * of each word is capitalized (excluding the first letter).
 * ---
 * The string will only contain letters and some combination of delimiter
 * punctuation characters separating each word.
 * For example: if str is "BOB loves-coding" then your program
 * should return the string bobLovesCoding.
 */
public class CamelCase {

    private static String[] removeSpace(String str){
        return str
                .toLowerCase()
                .replaceAll("([^a-z])", " ")
                .replaceAll(" +", " ")
                .trim().split(" ");

    }
    private String camelCase(String str){
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = removeSpace(str);
        int i =0;
        for(String wrd :words){
            if(i==0){
                stringBuilder.append(wrd);
            }
            stringBuilder.append(wrd.substring(0,1).toUpperCase()).append(wrd.substring(1));
            i++;

        }
        return stringBuilder.toString();





    }
}
