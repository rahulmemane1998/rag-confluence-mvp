package dsaUsingJavaC2W.warmup;

import java.util.ArrayList;
import java.util.List;

public class FactorCount
{
    public static void main(String[] args)
    {
        int n = 24;
        int count = factoruCount(n);
        System.out.println(count);
    }

    public static int factoruCount(int num)
    {
        //BruteForce Approch

//            int count = 0;
//            int i = 1 ;
//            while (i <= num) // Time Complexity : O(n)
//            {
//                if(num % i == 0)
//                {
//                    count++;
//                }
//                i++;
//            }
//            return count;
//
        //Optimized Approch

        int count =0 ;
        // factors will be 1, 2, 3 , 4 , 6 , 12 , 24 => till num/2 the factors will be there and num will be the last factor,
        // so iterting till num/2 will be enough at last we will add 1 to count
        for(int i =1 ; i <= num/2 ; i++)
        {
            if(num % i ==0)
            {
                count++;
            }
        }
        return count+1;
    }
}
