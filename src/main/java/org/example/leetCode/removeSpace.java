package org.example.leetCode;

public class removeSpace {
    private String solution(String sen){
        StringBuilder str = new StringBuilder();
        char[] characters = sen.toCharArray();
        for(char c:characters){
            if(c==' ') str.append("%20");
            str.append(c);
        }
        return str.toString();

    }
}
