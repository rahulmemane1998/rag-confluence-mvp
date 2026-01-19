package practice.java8features.steamAPI;

import java.util.Arrays;
import java.util.List;

public class listOfMethod
{
    public static void main(String[] args)
    {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        list.add(23);

        List<Integer> list2  = Arrays.asList(1,4,7,3,4,45);
        list2.add(54);
        //will throw unsupportedOperationException
        //List.of() is a Immutable list
        System.out.println(list);
        System.out.println(list2);

    }
}
