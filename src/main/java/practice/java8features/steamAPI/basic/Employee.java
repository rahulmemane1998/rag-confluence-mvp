package practice.java8features.steamAPI.basic;

import java.util.Objects;

public class Employee
{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}
