package Java.AuctionBid;
import java.util.*;
public class auctionBid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> myMap = new HashMap<>();

        System.out.println("Enter Bidder's Name");
        String name = sc.next();

        System.out.println("Enter a bid in $");;
        int bid = sc.nextInt();

        myMap.put(name, bid);
       // System.out.println(map);

       System.out.println("Are there any more bidders? (Enter true for Yes and false for No)");
       boolean bidder = sc.nextBoolean();
       
        if(bidder){
            for(int i=0; i<20; i++){
                System.out.println();
            }
        }

       while(bidder){
            System.out.println("Enter Bidder's Name: ");
            name = sc.next();
            System.out.println("Enter a bid in $");;
            bid = sc.nextInt();
            myMap.put(name, bid);
            System.out.println("Are there any more bidders? (Enter true for Yes and false for No)");
            bidder = sc.nextBoolean();
            if(bidder){
                for(int i=0; i<20; i++){
                    System.out.println();
                }
            }
        }

        Map.Entry<String, Integer> maxEntry = Collections.max(myMap.entrySet(), Map.Entry.comparingByValue());
        String maxKey = maxEntry.getKey();
        Integer maxValue = maxEntry.getValue();
        
       System.out.println("The winner of the auction is " + maxKey + " with a phenomenal bid of $" + maxValue);
    }
}