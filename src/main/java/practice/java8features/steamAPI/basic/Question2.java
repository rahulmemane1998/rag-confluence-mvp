package practice.java8features.steamAPI.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question2
{
    //Find all even numbers from a list of integers.
    public static void main(String[] args)
    {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(5);
        intList.add(20);
        intList.add(34);

        List<Integer> result  =  intList.stream().filter( even -> even%2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}
