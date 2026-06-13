package dsaUsingJavaC2W.array;

import java.util.Arrays;

public class SearchElement
{
    public static void main(String[] args)
    {
        int k  = 3;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Element present at Index : " + searchElement(k, arr));
    }

    public static int searchElement(int k , int[] arr)
    {
        Arrays.sort(arr);
        int midElement =  arr.length/2;
        if(midElement < k )
        {
            for(int i = midElement ; i < arr.length ; i++)
            {
                if(arr[i] == k)
                {
                    return i;
                }
            }
        }
        else
        {
            for(int i = 0 ; i < midElement ; i++)
            {
                if(arr[i] == k)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}
