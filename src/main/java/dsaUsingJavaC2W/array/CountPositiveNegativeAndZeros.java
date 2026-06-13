package dsaUsingJavaC2W.array;

public class CountPositiveNegativeAndZeros
{
    public static void main(String[] args)
    {
        int[] arr = {4, 6 , 17, 2, 9, 5, 2, -4, -23, -2, 0, 2, -76, 0, 23, -344};
        countEvenAndOddNum(arr);
    }

    public static void countEvenAndOddNum(int[] arr)
    {
        int positiveCount =0 ;
        int negavtiveount  = 0;
        int zeroCount = 0;
        for(int i =0 ; i< arr.length; i++)
        {
            if(arr[i] == 0)
            {
                zeroCount++;
            }
            if(arr[i] > 0)
            {
                positiveCount++;
            }
            if(arr[i] < 0)
            {
                negavtiveount++;
            }
        }
        System.out.println("Positive Numbers Count is : " +positiveCount);
        System.out.println("Negative Numbers Count is : " +negavtiveount);
        System.out.println("Zero Numbers Count is : " +zeroCount);
    }
}
