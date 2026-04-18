package practice.java8features.steamAPI.intermediate;

import java.util.List;
import java.util.Optional;

public class Question1
{
//    11. Find the maximum number in a list.

    public static void main(String[] args)
    {
        List<Integer> numList = List.of(2,5,6,3,7,3);

        Optional<Integer> n = numList.stream().max(Integer::compareTo);

        System.out.println(n.get());
    }

}
