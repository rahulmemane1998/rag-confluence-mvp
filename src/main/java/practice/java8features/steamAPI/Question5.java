package practice.java8features.steamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question5
{
   //Check if any number is greater than 100 in a list.
   public static void main(String[] args)
   {
       List<Integer> intList = new ArrayList<>();
       intList.add(1);
       intList.add(5);
       intList.add(20);
       intList.add(34);
       intList.add(698);

       List<Integer> result  = intList.stream().filter( num -> num > 100).collect(Collectors.toList());
       System.out.println(result);
   }
}
