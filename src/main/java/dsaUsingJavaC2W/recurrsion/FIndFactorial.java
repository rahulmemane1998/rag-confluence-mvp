package dsaUsingJavaC2W.recurrsion;

public class FIndFactorial
{
    public static void main(String[] args)
    {
        int n = 4;
        int factorial = findFactorial(n);
        System.out.println(factorial);
    }

    public static int findFactorial(int num)
    {
        if(num == 0)
        {
            return  1;
        }
        return num * findFactorial(--num);
    }
}
