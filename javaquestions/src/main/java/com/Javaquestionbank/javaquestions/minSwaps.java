package com.Javaquestionbank.javaquestions;
import java.util.*;
public class minSwaps {
    class Pair implements Comparable<Pair>

    {
        int x;
        int y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        public int compareTo(Pair p)
        {
            return this.x-p.x;
        }
    }

        public int minSwapsCount(int nums[])
        {
            int n=nums.length;
            Pair p[]=new Pair[n];
            for(int i=0;i<n;i++)
            {
                p[i]=new Pair(nums[i],i);
            }
            Arrays.sort(p);
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(p[i].y==i)
                    continue;
                else
                {
                    Pair temp=p[i];
                    int ind=p[i].y;
                    p[i]=p[p[i].y];
                    p[ind]=temp;
                    i--;
                    count++;
                }
            }
            return count;
        }
    }

