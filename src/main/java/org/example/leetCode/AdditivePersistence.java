package org.example.leetCode;

public class AdditivePersistence {

    private int find(int num){
        int times = 0;
        int added = num;
        while(added>9){
            int sum =0;
            String[] numCharacter = Integer.toString(num).split("");
            for(String i :numCharacter){
                sum += Integer.parseInt(i);
            }
            added=sum;
            num=sum;



        }
        return added;


    }
}
