package practice.java8features.steamAPI.intermediate;

import java.util.List;
import java.util.OptionalDouble;

public class Question4
{
//    14. Find the average of numbers in a list.
public static void main(String[] args)
{
    List<Integer> numList = List.of(2,5,6,3,7,6,9);

    //using for loop
    int num2 = 0;
    for(int i =0; i<= numList.stream().count()-1; i++)
    {
        num2 += numList.get(i);
    }
    int average = num2/numList.size();

    //using stream Api
    OptionalDouble sum34 = numList.stream().mapToDouble(Integer::intValue).average();
    System.out.println(sum34.getAsDouble());
}

}
