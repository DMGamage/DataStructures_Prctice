package org.example.leetCode;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class findDuplictesInArray {
    private int solution(int[] nums){
        Set<Integer> numSet = new HashSet<>();
        for(int num:nums){
            if(numSet.contains(num)) return num;
            numSet.add(num);
        }
        return -1;
    }
}
