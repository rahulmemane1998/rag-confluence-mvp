package dsaUsingJavaC2W.array;

public class CountPalindromeNumFromArray
{
    public static void main(String[] args)
    {
        int[] arr = {434, 616 , 171, 211, 934, 345, 256};
        System.out.println(countEvenAndOddNum(arr));
    }

    public static int countEvenAndOddNum(int[] arr)
    {
        int count = 0;
        for(int i : arr)
        {
            if(isPalinDrome(i))
            {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalinDrome(int num)
    {
        int temp = 0;
        int originalNum = num;
        while (num > 0)
        {
            int rem  = num % 10;
            temp = (temp * 10) + rem;
            num = num /10;
        }
        if(originalNum == temp)
        {
            return true;
        }
        return false;
    }
}
