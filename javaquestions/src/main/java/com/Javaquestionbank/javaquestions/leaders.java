package com.Javaquestionbank.javaquestions;

import java.util.ArrayList;

// Java program to reverse the list
// using Collections.reverse() method

import java.util.*;
public class leaders {

    public  static ArrayList<Integer> FindLeaders(int[] arr){
        int n=arr.length;
        int maxi=-9999;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=maxi){
                maxi=arr[i];
                list.add(maxi);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
