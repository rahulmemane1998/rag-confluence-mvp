package dsaUsingJavaC2W.warmup;

public class SumOfNaturalNumbers
{
    public static void main(String[] args)
    {
        int num = 10;
        System.out.println(getSumOfNumbers(num));
    }

    public static int getSumOfNumbers(int num)
    {
        //optimized
//        int sum = num * (num + 1)/2;
//        return sum;


        //bruteForce
        int sum =0;
        for(int i = 1 ; i<= num; i++)
        {
            sum += i;
        }
        return sum;
    }
}
