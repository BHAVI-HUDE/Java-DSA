package Stacks;
import java.util.*;
public class StackH1 {
    public static void main(String[] args) {
        int arr[] = {3,8,4,6,1,2};
    Stack<Integer> s = new Stack<>();
    int nxtGreater[] = new int[arr.length];

    for(int i=arr.length-1; i>=0;i--){
        //1.while
        while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
            s.pop();
        }

        //2.if-else
        if(s.isEmpty()){
            nxtGreater[i] = -1;
        } else {
            nxtGreater[i] = arr[s.peek()];
        }
        //3 push in s
        s.push(i);    
    }

    for(int j=0;j<nxtGreater.length;j++){
        System.out.print(nxtGreater[j]+" ");
    }
    System.out.println(); 
    }
}
