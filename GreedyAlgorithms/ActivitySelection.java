package GreedyAlgorithms;

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {

        // Activity Selection
        
        // You are given n activities with their start and end times. Select the maximum number of activities
        // that can be performed by a single person, assuming that a person can only work on a single
        // activity at a time. Activities are sorted according to end time.
        // start = [10, 12, 20]
        // end = [20, 25, 30]
        // ans = 2 (AO & A2)
                
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        int activities [][] = new int[start.length][3];
        for(int i=0;i<start.length;i++){
        activities[i][0] = i;//storing original index
        activities[i][1] = start[i];
        activities[i][2] = end[i];
        }

        //lambda funtion
        Arrays.sort(activities, Comparator.comparingDouble(o ->o[2]));
        //In this case sorting will be on the basis of column index 2
        //Comparator is an interface for sorting java objects.

        
        //end time basis sort
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //first activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i=0;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //select activity
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("Maximum Activities = "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}
