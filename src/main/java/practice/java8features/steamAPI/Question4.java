package practice.java8features.steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Question4
{
    //Find the first element in a list using Stream API.
    public static void main(String[] args)
    {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(5);
        intList.add(20);
        intList.add(34);

        Optional<Integer> i = intList.stream().findFirst();
        System.out.println(i);
        }
    }
