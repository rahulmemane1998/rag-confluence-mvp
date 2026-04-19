package practice.collection.list;

import org.springframework.data.relational.core.sql.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListDemo
{
    public static void main(String[] args)
    {
        List<Integer> integerArrayList = Arrays.asList(1,2,3,4);
        CopyOnWriteArrayList<Integer> copy = new CopyOnWriteArrayList<>(integerArrayList);

        System.out.println("Original List " );
        integerArrayList.forEach(System.out::println);

        copy.add(7);

        System.out.println("            ");
        System.out.println("Copied List ");
        copy.forEach(System.out::println);

    }
}
