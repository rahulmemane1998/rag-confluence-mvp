package practice.java8features.steamAPI.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question1
{
//    1.  Convert a List of strings to uppercase using Stream API.

    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Sudam");
        list.add("Memane");
        List<String> result = list.stream().map( name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);
    }
}
