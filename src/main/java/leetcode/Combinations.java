package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations
{
    public static void main(String[] args)
    {
        int n = 10;
        int k = 4;
        List<List<Integer>> result = combine(n,k);
        System.out.println(result.stream().toList());
    }


    private static List<List<Integer>> combine(int n, int k)
    {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> nn = new ArrayList<>();
        for(int r = 1 ; r<=n; r++)
        {
            if(r <= n)
            {
                nn.add(r);
            }
        }


        int i =0;
        while(i < n) //n=10
        {
            List<Integer> addNewList = new ArrayList<>();
            for(int j=0 ; j <= addNewList.size(); j++)
            {
                if(j < k) //n=10
                {
                    addNewList.add(nn.get(j));
                }
            }
            result.add(addNewList);
            i++;
        }
        return result;
    }
}
