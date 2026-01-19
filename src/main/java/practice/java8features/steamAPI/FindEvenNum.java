package practice.java8features.steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNum
{
    public static void main(String[] args)
    {
        List<Integer> list1  = new ArrayList<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(20);

        List<Integer> evenNumList =  list1.stream().filter( element -> element % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumList);
    }
}
