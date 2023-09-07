package org.example.leetCode;


/**
 * Have the function Superincreasing(arr) take the array of numbers stored in arr
 * and determine if the array forms a superincreasing sequence
 * where each element in the array is greater than the sum of all previous elements.
 * The array will only consist of positive integers.
 * For example: if arr is [1, 3, 6, 13, 54] then your program
 * should return the string "true" because it forms a superincreasing sequence.
 * If a superincreasing sequence isn't formed, then your program
 * should return the string "false"
 */
public class SuperIncreasing {

    private static String superIncresing(int[] arr){
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > sum) {
                sum += arr[i];
            } else {
                return "false";
            }
        }
        return "true";
}
}