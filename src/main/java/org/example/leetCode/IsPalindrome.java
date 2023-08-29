package org.example.leetCode;

public class IsPalindrome {

    private  static boolean checkString(String str){
        char[] strCharArray = str.toCharArray();
        int len = str.length();
        for(int i=0;i<len/2;i++){
            if(strCharArray[i] != strCharArray[len-i-1]){
                return false;
            }

        }
        return true;



    }

    private static String palindromeCreator(String str) {
        if (isPalindrome(str)) {
            return "palindrome";
        }

        for (int i = 0; i < str.length(); i++) {
            StringBuilder combo = new StringBuilder();
            for (int k = 0; k < str.length(); k++) {
                if (k != i) {
                    combo.append(str.charAt(k));
                }
            }
            if (isPalindrome(combo.toString()) && combo.length() >= 3) {
                return String.valueOf(str.charAt(i));
            }
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                StringBuilder combo = new StringBuilder();
                for (int k = 0; k < str.length(); k++) {
                    if (k != i && k != j) {
                        combo.append(str.charAt(k));
                    }
                }
                if (isPalindrome(combo.toString()) && combo.length() >= 3) {
                    return String.valueOf(str.charAt(i)) + str.charAt(j);
                }
            }
        }

        return "not possible";
    }


}
