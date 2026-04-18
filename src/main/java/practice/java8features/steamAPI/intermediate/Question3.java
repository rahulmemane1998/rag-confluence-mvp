package practice.java8features.steamAPI.intermediate;

import java.util.List;
import java.util.Optional;

public class Question3
{
//    13. Calculate the sum of all numbers in a list.
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(2,5,6,3,7,3);

        //using for loop
        int num2 = 0;
        for(int i =0; i<= numList.stream().count()-1; i++)
        {
            num2 += numList.get(i);
        }

        //using stream Api
        int sum  = numList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
