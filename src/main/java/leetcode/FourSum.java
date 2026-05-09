package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum
{
    public static void main(String[] args)
    {
        int[] nums = {2,2,2,2,2};
        int target = 8;
        Set<List<Integer>> result = fourSum(nums,target);
        System.out.println(result.stream().toList());
    }

    private static Set<List<Integer>> fourSum(int[] nums, int target)
    {
        Set<List<Integer>> result = new HashSet<>();
        for(int i =0 ; i < nums.length -1 ; i++)
        {
            for(int j = i+1 ; j < nums.length; j++)
            {
                for(int k =j+1 ; k < nums.length; k++)
                {
                    for(int l =k+1 ; l < nums.length; l++)
                    {
                        if(nums[i] + nums[j] + nums[k] + nums[l]  == target )
                        {
                            List<Integer> newList = new ArrayList<>();
                            newList.add(nums[i]);
                            newList.add(nums[j]);
                            newList.add(nums[k]);
                            newList.add(nums[l]);
                            result.add(newList);
                        }
                    }
                }
            }
        }
        return result;
    }
}
