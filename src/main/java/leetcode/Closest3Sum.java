package leetcode;

import java.util.Arrays;

public class Closest3Sum
{
    public static void main(String[] args)
    {
        int[] num = {-1,2,1,-4};
        int target =1 ;
        int result =  threeSumClosest(num,target);

        System.out.println(result);
    }

    public static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);  // Step 1: Sort array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                if (currentSum < target) {
                    left++;   // Need bigger sum
                } else if (currentSum > target) {
                    right--;  // Need smaller sum
                } else {
                    return currentSum; // Exact match
                }
            }
        }
        return closestSum;

    }
}
