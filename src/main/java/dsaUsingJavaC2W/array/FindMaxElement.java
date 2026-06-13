package dsaUsingJavaC2W.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMaxElement
{
    public static void main(String[] args)
    {
        int k  = 3;
        int[] arr = {4, 6 , 17, 2, 9, 5, 2};

        System.out.println("Max Element is : " + searchElement(k, arr));
    }

    //Optimize
//    public static int searchElement(int k , int[] arr)
//    {
//        Arrays.sort(arr);
//        int maxElement =0;
//        return maxElement = arr[arr.length-1];
//    }

    //bruteForce
    public static int searchElement(int k , int[] arr)
    {
        int maxElement = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] > maxElement)
            {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}
