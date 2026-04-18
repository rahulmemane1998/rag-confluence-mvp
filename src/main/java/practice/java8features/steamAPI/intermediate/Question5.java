package practice.java8features.steamAPI.intermediate;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question5
{
//    15. Convert a list into a Set using streams.
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(2,5,6,3,7,6,9);

        //using stream Api
        Set<Integer> sum34 = numList.stream().collect(Collectors.toSet());
        System.out.println(sum34);

    }

}
