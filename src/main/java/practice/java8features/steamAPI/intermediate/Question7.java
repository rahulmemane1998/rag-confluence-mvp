package practice.java8features.steamAPI.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question7
{
//     Sort strings by length.
    public static void main(String[] args)
    {
        List<String> newList = Arrays.asList("Manhattan", "Rahul", "Sudam", "Memane");

        List<String> sss = newList.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        System.out.println(sss);


    }

}
