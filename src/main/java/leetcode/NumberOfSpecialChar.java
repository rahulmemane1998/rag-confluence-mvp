package leetcode;

import java.util.Arrays;

public class NumberOfSpecialChar
{
    public static void main(String[] args)
    {
        String word = "aabbBcdfgtGHuIiEe";
        int count  = getSpecCharCount(word);
        System.out.println(count);
    }

    public static int getSpecCharCount(String word)
    {
        String[] arr = word.split("");
        int lowerCaseCount = 0;
        int upperCaseCount = 0;

        for(int i =0 ; i < arr.length; i++)
        {
            String ch = arr[i];
            String upperCaseCh = ch.toUpperCase();
                if(arr[i] == upperCaseCh)
                {
                    upperCaseCount++;
                }
                else
                {
                    lowerCaseCount++;
                }
            }
        return 0;
    }

}
