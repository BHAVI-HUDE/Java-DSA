package Hashing;
import java.util.*;
public class HS {
    public static void main(String[] args) {

        LinkedList<LinkedList<Integer>> set = new LinkedList<>();
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(1);
        ll1.addFirst(2);
        ll1.addFirst(3);
        ll1.addFirst(4);
        ll1.addFirst(5);
        set.add(ll1);
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.addFirst(6);
        ll2.addFirst(7);
        ll2.addFirst(8);
        ll2.addFirst(9);
        ll2.addFirst(10);
        set.add(ll2);

        System.out.println(set.size());





        // HashSet<LinkedList<Integer>> set = new HashSet<>();

        // LinkedList<Integer> ll1 = new LinkedList<>();
        // ll1.addFirst(1);
        // ll1.addFirst(2);
        // ll1.addFirst(3);
        // ll1.addFirst(4);
        // ll1.addFirst(5);
        // set.add(ll1);

        // LinkedList<Integer> ll2 = new LinkedList<>();
        // ll2.addFirst(6);
        // ll2.addFirst(7);
        // ll2.addFirst(8);
        // ll2.addFirst(9);
        // ll2.addFirst(10);
        // set.add(ll2);

        // System.out.println(set);





        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(2);
        // set.add(1);

        // System.out.println(set);
        // System.out.println(set.size());
        // set.remove(2);
        // System.out.println(set);
        // set.clear();
        // System.out.println(set.size());
        // System.out.println(set.isEmpty());

        // if(set.contains(2)){
        //     System.out.println("set contains 2");
        // }
        // if(set.contains(4)){
        //     System.out.println("set contains 4");
        // }

    }
}
