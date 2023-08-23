package org.example.leetCode;

import java.util.HashSet;

/**
 * Have the function DistinctCharacters(str) take the str parameter being passed
 * and determine if it contains at least 10 distinct characters,
 * if so, then your program should return the string true,
 * otherwise it should return the string false.
 * ---
 * For example: if str is "abc123kkmmmm?" then your program should return the string false
 * because this string contains only 9 distinct characters:
 * a, b, c, 1, 2, 3, k, m. ? adds up to 9.
 */

public class DistinctCharacters {
private static String distinctCharacters(String str){
    HashSet<String> stringSet = new HashSet<>();
    for(String newStr:str.split("")){
        stringSet.add(newStr);
    }
    return stringSet.size()>=10 ? "true":"false";
}
}
