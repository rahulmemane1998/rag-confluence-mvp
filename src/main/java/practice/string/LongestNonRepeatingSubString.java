package practice.string;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubString
{
    public static void main(String[] args)
    {
        String s1 = "abcabcbb";

        int maxLength  = 0;
        int start  = 0 ;

        Set<Character> charSet  =  new HashSet<>();
        for(int end  = 0 ; end  < s1.toCharArray().length -1 ; end++)
        {
            char cr  = s1.charAt(end);
            while (charSet.contains(cr))
            {
                charSet.remove(cr);
                start++;
            }

            charSet.add(cr);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        System.out.println("MAx length  : " + maxLength);
    }
}
