package dsaUsingJavaC2W.array;

public class CountEvenAndOddNumbers
{
    public static void main(String[] args)
    {
        int[] arr = {4, 6 , 17, 2, 9, 5, 2};
        countEvenAndOddNum(arr);
    }

    public static void countEvenAndOddNum(int[] arr)
    {
        int evenCount =0 ;
        int oddCount  = 0;
        for(int i =0 ; i< arr.length; i++)
        {
            if(arr[i] %2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }
        System.out.println("Even Numbers Count is : " +evenCount);
        System.out.println("Odd Numbers Count is : " +oddCount);
    }
}
