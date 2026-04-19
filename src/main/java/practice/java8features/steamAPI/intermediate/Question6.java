package practice.java8features.steamAPI.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question6
{
    public static void main(String[] args)
    {
        // Count how many strings have length > 5.
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Rahul");
        stringList1.add("Memane");
        stringList1.add("Memncfe");
        stringList1.add("Manhattan");

        long size = stringList1.stream().filter( fivelength  ->
                fivelength.length() > 5).count();

        System.out.println(size);
    }

}
