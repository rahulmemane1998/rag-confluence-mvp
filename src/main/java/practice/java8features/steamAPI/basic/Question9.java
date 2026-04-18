package practice.java8features.steamAPI.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question9
{
//    9.  Sort a list of integers using Stream API.

    public static void main(String[] args)
    {
        List<Integer> intList = new ArrayList<>();
        intList.add(14);
        intList.add(5);
        intList.add(250);
        intList.add(34);

        List<Integer> result  =  intList.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
