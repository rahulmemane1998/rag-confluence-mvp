package practice.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2
{
    public static void main(String[] args)
    {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Rahul");
        studentMap.put(2, "Sudam");
        studentMap.put(3, "Ankita");
        studentMap.put(4, "Ankit");
        studentMap.put(5, "Ankita");


        Set<Map.Entry<Integer, String>> entrySet = studentMap.entrySet();
        for(Map.Entry<Integer, String> newEntry : entrySet)
        {
            newEntry.setValue(newEntry.getValue().toUpperCase());
        }

        System.out.println(studentMap);
    }
}
