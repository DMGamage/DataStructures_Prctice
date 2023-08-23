package org.example.leetCode;
/**
 * Have the function DashInsert(str) insert dashes ('-')
 * between each two odd numbers in str. For example:
 * if str is 454793 the output should be 4547-9-3.
 * Don't count zero as an odd number.
 */

public class DashInsert {
    private static String dashInsert(String str){
        StringBuilder dashed = new StringBuilder();
        char[] chr = str.toCharArray();
        for(int i =0; i<chr.length-1;i++){
            if(i==0){
                dashed.append(chr[0]);
            }
            if(Character.getNumericValue(chr[i+1])%2 !=0){
                dashed.append(chr[i+1]);
                dashed.append("-");
            }
            dashed.append(chr[i+1]);
        }
        return dashed.toString();



    }
}
