package GreedyAlgorithms;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int count = 0;
        int amount = 1059;

        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<coins.length;i++){
           if(coins[i] <= amount){
                while(coins[i] <= amount){
                ans.add(coins[i]);
                count++;
                amount -= coins[i];
                }
            }
        }
            
        
        System.out.println("Number of coins used = "+count);
        System.out.print("Coins used : ");
        for(int i=0;i<ans.size();i++){
            System.out.print(+ans.get(i)+" ");
        }
        System.out.println();

    }
}
