package dsaUsingJavaC2W.array;

import java.util.Arrays;

public class FindConsecutiveNum
{
    public static void main(String[] args)
    {
        int[] arr = {4, 6 , 17, 2, 9, 5, 6, 23, 56, 23, 7, 87, 34 ,8};
        int[] arr1 = {2,4,5,6,6,7,8,9,17,23,23,34,56,87};
        System.out.println(findConsecutiveNum(arr));
    }

    public static int findConsecutiveNum(int[] arr)
    {
        Arrays.sort(arr);
        int count =0;
        for (int i = 0; i < arr.length -1; i++)
        {
            if(arr[i+1] != arr[i] +1)
            {
                continue;
            }
            count++;
        }
        return count;
    }
}
