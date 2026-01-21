package Hashing;
import java.util.*;
public class Classroom2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        //Insert O(1)
        hm.put("India",50);
        hm.put("China", 150);
        hm.put("US",50);
        hm.put("Indonesia", 6);
        hm.put("Nepal",5 );

        //Iterate
        //hm.entrySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k: keys) {
            System.out.println("key = "+k+ ",value = "+hm.get(k));
        }
    }
}
