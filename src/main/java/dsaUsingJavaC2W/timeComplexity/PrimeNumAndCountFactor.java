package dsaUsingJavaC2W.timeComplexity;

public class PrimeNumAndCountFactor
{
    public static void main(String[] args)
    {
        System.out.println(isPrimeNum(9));
    }

    static boolean isPrimeNum(int num)
    {
        if(countFactor(num) == 2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    static int countFactor(int num)
    {
        int count  = 0;

        for(int i = 1; i <= num/i ; i++) //O(sqrt(n))
        {
            //i<= numm , i <=  num/i, i*i <= num, i <= sqrt(num), i< num/2
            if(num % i == 0)
            {
                if(num/i == i)
                {
                    count++;
                }
                else
                {
                    count = count + 2;
                }
            }
        }

        return count;
    }
}
