package practice.java8features.steamAPI.basic;

import practice.java8features.steamAPI.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question8
{
//    8.  Remove duplicate elements from a list using streams.
    public static void main(String[] args)
    {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(5);
        intList.add(20);
        intList.add(5);
        intList.add(54);
        intList.add(20);

        List<Integer> distinctList = intList.stream().distinct().collect(Collectors.toUnmodifiableList());

        System.out.println(distinctList);


        List<Employee> employees = List.of(
                new Employee(1, "rahul", 33),
                new Employee(2, "Sagar", 55),
                new Employee(2, "Sagar", 55),
                new Employee(3, "Snehal", 44),
                new Employee(3, "Snehal", 44));

        List<Employee> disticntEmploee = employees.stream().distinct().collect(Collectors.toUnmodifiableList());
        System.out.println(disticntEmploee);

    }
}
