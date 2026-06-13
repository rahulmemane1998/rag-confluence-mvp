package dsaUsingJavaC2W.array;

import java.util.Arrays;

public class ProductOfAllElements
{
    public static void main(String[] args)
    {
        int k  = 3;
        int[] arr = {1,2,3,10,44};

        int[] arr1 = sumOfAllElement(k, arr);

        for(int  i : arr1)
        {
            System.out.println("Product of element is " + i);
        }

    }

    public static int[] sumOfAllElement(int k , int[] arr)
    {
        int sum = 0 ;
        int[] product = new int[arr.length];
        for(int i =0 ; i < arr.length; i++)
        {
            sum = arr[i] * arr[i];
            product[i] = sum;
        }
        return product;
    }
}
