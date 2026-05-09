package leetcode;

import java.util.*;

public class ThreeSum
{
    public static void main(String[] args)
    {
       int[] num = {-1,0,1,2,-1,-4};

        Set<List<Integer>> finalSet = new HashSet<>();
        int addition = 0;
        for(int i = 0 ; i < num.length -1 ; i++)
        {
            for(int j= i+1; j< num.length; j++)
            {
                for(int k =j+1; k< num.length ; k++)
                {
                    addition  = num[i] + num[j] + num[k];
                    if(addition == 0)
                    {
                        List<Integer> semiFinalList =  new ArrayList<>();
                        semiFinalList.add(num[i]);
                        semiFinalList.add(num[j]);
                        semiFinalList.add(num[k]);
                        Collections.sort(semiFinalList);
                        finalSet.add(semiFinalList);
                    }
                }
            }
        }
        List<List<Integer>> convertedList = finalSet.stream().toList();
        System.out.println(convertedList);
    }
}
