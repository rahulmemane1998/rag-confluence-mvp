package dsaUsingJavaC2W.array;

import java.util.Arrays;

public class FindMinElement
{
    public static void main(String[] args)
    {
        int k  = 3;
        int[] arr = {42, 622 , 17, 21, 29, 522, 25,45};

        System.out.println("Max Element is : " + searchElement(k, arr));
    }

    //Optimize
//    public static int searchElement(int k , int[] arr)
//    {
//        Arrays.sort(arr);
//        int maxElement =0;
//        return maxElement = arr[0];
//    }

    //bruteForce
    public static int searchElement(int k , int[] arr)
    {
        int maxElement = arr[0];
        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] == 0)
            {
                return arr[i];
            }
            if(arr[i] < maxElement)
            {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
}

