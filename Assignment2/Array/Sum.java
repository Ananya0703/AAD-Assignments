package com.Assignment2.Array;

public class Sum {
    public static void main(String[] args){
        int[] vals = {1,2,3,4,5,6,7,8};
        int ans = 0;
        for (int num : vals){
            ans = ans + num;
        }
        System.out.println("The sum of the array is: " + ans);
    }
}
