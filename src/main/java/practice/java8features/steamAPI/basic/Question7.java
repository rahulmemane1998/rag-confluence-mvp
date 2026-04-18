package practice.java8features.steamAPI.basic;

import java.util.ArrayList;
import java.util.List;

public class Question7
{
//    7.  Find all strings starting with “A” from a list.
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Rahul");
        list.add("Sudam");
        list.add("Ankita");
        list.add("Ankit");
        list.add("Ankita");

        List<String> newListWithA = list.stream().filter(
                name -> name.startsWith("A")).toList();

        System.out.println(newListWithA);
    }
}
