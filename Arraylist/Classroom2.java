import java.util.ArrayList;
import java.util.Collections;

public class Classroom2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(2);
        arrlist.add(5);
        arrlist.add(9);
        arrlist.add(3);
        arrlist.add(6);
        System.out.print(arrlist);
        System.out.println();
        swap(arrlist,1,4);
        System.out.print(arrlist);
        Collections.sort(arrlist);
        System.out.println();
        System.out.print(arrlist);
    }
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        }
    }

