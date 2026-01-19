package practice.java8features.steamAPI;

import java.util.ArrayList;
import java.util.List;

public class DoubleTheNumberFromList
{
    public static void main(String[] args)
    {
        List<Integer> list1  = new ArrayList<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(20);

        List<Integer> intList = list1.stream().map(element -> element * 2).toList();

        System.out.println(intList);
    }

}
