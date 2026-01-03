package practice.string;

class LongestPalindromeFromString
{
    public static void main(String[] args)
    {
        extracted();
    }

    private static void extracted() {
        String s1 = "cbbd";

        String longest = "";

        for(int i = 0 ; i < s1.length(); i++)
        {
            for(int j = i; j < s1.length(); j++)
            {
               String subString  =  s1.substring(i , j+1);
               boolean isPalindrome = isPalindrome(subString);
               if(isPalindrome && subString.length() > longest.length())
               {
                   longest = subString;
               }
            }
        }
        System.out.println("longest Substring is :" + longest);
    }

    private static boolean isPalindrome(String subString)
    {
        int start = 0;
        int end  = subString.length() -1;
        while (start < end)
        {
            if(subString.charAt(start) != subString.charAt(end))
            {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}