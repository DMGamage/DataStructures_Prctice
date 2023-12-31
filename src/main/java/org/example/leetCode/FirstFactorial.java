package org.example.leetCode;
/**
 * Have the function FirstFactorial(num) take
 * the num parameter being passed and return the factorial of it.
 * For example: if num = 4, then your program
 * should return (4 * 3 * 2 * 1) = 24.
 * For the test cases, the range will be between 1 and 18
 * and the input will always be an integer.
 */

public class FirstFactorial {

    private static int firstFactorial(int num){
        if(num==0){
            return 1;
        }
        else return firstFactorial(num-1)*num;


    }

}
