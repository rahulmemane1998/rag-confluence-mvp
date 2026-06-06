package dsaUsingJavaC2W.recurrsion;

public class SumOfNaturalNum
{
    public static void main(String[] args)
    {
        int n = 5;
        int finalSum = sumOfNum(n);
        System.out.println(finalSum);
    }

    public static int sumOfNum(int n)
    {
       if(n == 0)
       {
           return 0;
       }
       return n + sumOfNum(--n);
    }
}
