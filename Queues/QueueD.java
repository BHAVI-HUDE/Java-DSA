package Queues;

import java.util.*;

public class QueueD {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // Or we can make it with ArrayDeque
        //Queue in JCF is not a class But an Interface.
     //&  Interfaces ki objects nhi bana sakte to queue ko implement karne wali classes ki objects bnate hai.
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
