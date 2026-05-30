package dsaUsingJavaC2W.timeComplexity;

public class PrintNaturalNum
{
    public static void main(String[] args)
    {
        int n =10;
        printNum(n);
    }

    public static void printNum(int n)
    {
       if(n == 1)
       {
           return;
       }
       printNum(--n);
       System.out.println(n);
    }
}
