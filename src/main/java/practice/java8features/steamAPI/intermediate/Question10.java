package practice.java8features.steamAPI.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

public class Question10
{
    public static void main(String[] args)
    {
//        20. Merge two lists using Stream API.
        List<String> newList1 = Arrays.asList("Manhattan", "Rahul", "Sudam", "Memane");
        List<String> newList2 = Arrays.asList("Banglore", "Karnataka");

        List<String> ddd =  Stream.concat(newList1.stream(), newList2.stream())
                .collect(Collectors.toList());

        System.out.println(ddd);
    }
}
