package practice.java8features.steamAPI.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question8
{
    //18. Get top 3 largest numbers from a list.
    public static void main(String[] args)
    {
        List<Integer> intList = Arrays.asList(1,4,7,2,4,8,100);

        List<Integer> intList1 = intList.stream().sorted(Comparator.reverseOrder()).limit(3)
                .collect(Collectors.toList());

        System.out.println(intList1);
    }

}
