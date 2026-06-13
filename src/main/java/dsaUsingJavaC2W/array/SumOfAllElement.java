package dsaUsingJavaC2W.array;

public class SumOfAllElement
{
    public static void main(String[] args)
    {
        int k  = 3;
        int[] arr = {1,2,3,10,44};

        System.out.println("Sum of all element is : " + sumOfAllElement(k, arr));
    }

    public static int sumOfAllElement(int k , int[] arr)
    {
        int sum = 0 ;
        for(int i =0 ; i< arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
}
