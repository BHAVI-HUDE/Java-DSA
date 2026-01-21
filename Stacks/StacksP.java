package Stacks;

import java.util.*;

public class StacksP {
    public static boolean isPalindrome(LinkedList<Character> ll){
        Stack<Character> s = new Stack<>();
        int i=0;
        while(i<ll.size()){
            s.push(ll.get(i));
            i++;
        }
        LinkedList<Character> lli = new LinkedList<>();
        while(!s.isEmpty()){
        lli.add(s.pop());
        }
        int j=0;
        while(j<ll.size()){
           if(ll.get(j) == lli.get(j)){
                j++;
           } else{
            return false;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.add('A');
        ll.add('K');
        ll.add('C');
        ll.add('K');
        ll.add('A');
        System.out.println(isPalindrome(ll));
    }
}
