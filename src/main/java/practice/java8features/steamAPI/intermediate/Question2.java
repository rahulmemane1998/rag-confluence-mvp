package practice.java8features.steamAPI.intermediate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class Question2
{
    private static final Logger log = LoggerFactory.getLogger(Question2.class);

    public static void main(String[] args)
    {
//        12. Find the minimum number in a list.

        List<Integer> numList = List.of(2,5,6,3,7,3);

        Optional<Integer>  num = numList.stream().min(Integer::compareTo);

        System.out.println(num.get());
    }
}
