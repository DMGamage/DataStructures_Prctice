package org.example.leetCode;

import java.util.*;

public class printLinkedListOrderReverse {

    private int[] solution(ListNode head){
        ArrayList<Integer> rmp = new ArrayList<>();

        recur(head);
        int[] newArray = new int[rmp.size()];
        for(int i =0;i<rmp.size();i++){
            newArray[i] =rmp.get(i);
            return newArray;

        }



        void recur(ListNode head){
            if(node.head = null) return;
            recur(head.next);
            rmp.add(head.value);


        }
    }
}
