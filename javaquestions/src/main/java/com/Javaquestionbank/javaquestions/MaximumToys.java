package com.Javaquestionbank.javaquestions;

import java.util.Arrays;

public class MaximumToys {

    public static int FindMaximumToys(int[] arr,int amount){

        int n=arr.length;
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(amount>=arr[i]) count++;
            amount-=arr[i];
        }
        return count;
    }
}
