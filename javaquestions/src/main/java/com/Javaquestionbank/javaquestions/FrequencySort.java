package com.Javaquestionbank.javaquestions;
import java.util.*;
public class FrequencySort {
    public  static ArrayList<Integer> freqSort(ArrayList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<list.size();i++)
        {
            map.put(list.get(i),map.getOrDefault(list.get(i),0)+1);
        }
        Collections.sort(list,(n1,n2)->{
            int freq1=map.get(n1);
            int freq2=map.get(n2);
            if(freq1!=freq2)
            {
                return freq2- freq1;
            }
            return n1-n2;
        });
        return list;
    }
}
