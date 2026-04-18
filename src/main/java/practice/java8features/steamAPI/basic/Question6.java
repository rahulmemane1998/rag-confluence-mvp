package practice.java8features.steamAPI.basic;

import practice.java8features.steamAPI.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Question6
{
    //Convert a List to List.
    public static void main(String[] args)
    {
        List<Employee> employees = List.of(
               new Employee(1,"Rahul", 60),
                new Employee(2,"Sagar", 90),
                new Employee(3,"Snehal", 80));

        List<EmployeeDTO> employeeDTOS = employees.stream().map(info ->
                new EmployeeDTO(info.getId(), info.getName())).collect(Collectors.toUnmodifiableList());

        System.out.println(employeeDTOS);
    }
}
