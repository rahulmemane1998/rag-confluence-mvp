package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTrangle
{
    public static void main(String[] args)
    {
        List<List<Integer>> result  = generate(5);
        System.out.println(result.stream().toList());
    }

    private static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> result = new ArrayList<>();

        for(int i =1; i <= numRows; i++)
        {
            if(i == 1)
            {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                result.add(list);
            }
            if( i == 2)
            {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                list.add(1);
                result.add(list);
            }
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < i; j++)
            {
                list.add(1);
                list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}
