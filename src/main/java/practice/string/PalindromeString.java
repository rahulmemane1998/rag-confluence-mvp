package practice.string;

public class PalindromeString
{
    public static void main(String[] args)
    {
        PalindromeString palindromeString = new PalindromeString();
        System.out.println(palindromeString.extracted());
    }

    private boolean extracted()
    {
        String s1 = "madam";
        int start = 0;
        int end  = s1.length() - 1;

        while (start < end)
        {
            if(s1.charAt(start) != s1.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
