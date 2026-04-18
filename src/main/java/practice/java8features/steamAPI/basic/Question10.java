package practice.java8features.steamAPI.basic;

import java.util.ArrayList;
import java.util.List;

public class Question10
{
//    10. Print all elements using forEach().
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Sudam");
        list.add("Ankita");
        list.add("Ankit");
        list.add("Ankita");

        list.stream().forEach(name -> System.out.println(name));
    }
}
