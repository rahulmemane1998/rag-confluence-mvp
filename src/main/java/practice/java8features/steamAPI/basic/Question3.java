package practice.java8features.steamAPI.basic;

import java.util.ArrayList;
import java.util.List;

public class Question3
{
    // Count the number of elements in a list using streams.
    public static void main(String[] args)
    {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(5);
        intList.add(20);
        intList.add(34);

        long count  =  intList.stream().count();
        System.out.println(count);
    }
}
