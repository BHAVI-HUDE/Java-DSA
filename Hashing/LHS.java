package Hashing;
import java.util.*;
public class LHS {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);

        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("union = "+ set.size());

        //intersection 
        set.clear();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
            }

            int count = 0;
            for(int i=0; i<arr2.length; i++) {
                if(set.contains(arr2[i])){
                    count++;
                    set.remove(arr2[i]);
                }
            }

            System.out.println("Intersection = " + count);
        }



    }

