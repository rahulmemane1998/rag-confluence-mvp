package practice.java8features.steamAPI.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9
{
    public static void main(String[] args)
    {
        //19. Skip the first 5 elements of a list.

        List<Integer> intList = Arrays.asList(1,4,7,2,4,8,100);

        List<Integer> intList1 = intList.stream().skip(5).collect(Collectors.toList());

        System.out.println(intList1);

    }
}
