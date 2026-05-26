package dsaUsingJavaC2W.warmup;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int num = 51;
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int num)
    {
        int count = 0;
        for(int i = 1; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }
        count = count +1;
        if(count == 2)
        {
            return true;
        }
        return false;
    }
}
