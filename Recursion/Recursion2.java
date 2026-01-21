import java.security.Key;

public class Recursion2 {
    public static void main(String[]args){
        String arr[] = {"zero","one","two", "three","four","five", "six", "seven", "eight", "nine"};
        numberName(2025, arr);
    }
    // Q1: For a given integer array of size N.
    // You have to find all the occurrences (indices) of a given element (Key) 
    // and print them. Use a recursive function to solve this problem.
    // Sample Input: arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2},
    // key = 2 Sample Output: 1 5 7 8

    public static void allOccurrences(int arr[], int idx, int key){
        if(idx == arr.length){
            return;
        }
        if(arr[idx] == key){
            System.out.println(idx);
        }
        allOccurrences(arr, idx+1, key);
    }
    
    //Question 2 :You are given a number (eg -  2019), convert it into a String
    // of english like “two zero one nine”.  Use a recursive function to solve 
    // this problem.
    // NOTE-The digits of the number will only be in the range0-9 and
    // the last digit of a number can’t be 0.
    // Sample Input: 1947
    // Sample Output: “one nine four seven

    public static void numberName(int num, String arr[]){
        if(num<10){
            System.out.print(arr[num]+" ");
            return;
        }
        int lastDigit = num % 10;
        numberName(num/10,arr);
        System.out.print(arr[lastDigit]+" ");
    }
}
