package practice.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class map1
{
    public static void main(String[] args)
    {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Rahul");
        studentMap.put(2, "Sudam");
        studentMap.put(3, "Ankita");
        studentMap.put(4, "Ankit");
        studentMap.put(5, "Ankita");

        Set<Integer> rollNumber = studentMap.keySet();
        for(int i : rollNumber)
        {
            if(i == 5)
            {
                studentMap.put(5, "Suhas");
            }
        }

        System.out.println(studentMap);

    }
}
