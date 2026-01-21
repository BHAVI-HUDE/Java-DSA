public class Recursion{
    public static void main(String[] args){
        // int arr[] = {1,3,2,6,2,2,9};
        // System.out.println(lastOccurance(arr, 2,0));
        // System.out.println(tilling(4));
        String s = "appnnacollege";
        StringBuilder str = new StringBuilder();
        boolean arr[] = new boolean[26];
        printBinaryStrings(3, 0, "");
    }




    public static int firstOccurance(int arr[],int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return firstOccurance(arr, target, i+1);
    }
    public static int lastOccurance(int arr[],int target, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound =  lastOccurance(arr, target, i+1);
        if(isFound == -1 && arr[i] == target){
            return i;
        }
        return isFound;
    }
    //Tilling Problem:
    //Q. Given a 2xn board and tiles of size 2x1. Count the number of ways to tile the given board using the 2x1 tiles.
    //(A tile can either be placed vertically or horizontally)

    public static int tilling(int n){
        if(n==0||n==1){
            return 1;
        }
        return (tilling(n-1) + tilling(n-2));
    }
    //Q. Remove duplicates in a string.

    public static void removeDuplicates(String s, int idx, StringBuilder newStr, boolean arr[]){
        if(idx == s.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = s.charAt(idx);
        if(arr[currChar - 'a'] == true){
            removeDuplicates(s,idx+1,newStr,arr);
        }
        else{
            arr[currChar- 'a'] = true;
            removeDuplicates(s,idx+1,newStr.append(currChar),arr);
        }
    }

    //Q. Friends pairing problem
    // Given n friends, each one can remain single or can be paired up with some other friend.
    // Each friend can be paired only once.
    // Find out the total number of ways in which friends can remain single or can be paired up.

    public static int friendsPair(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendsPair(n-1) + ((n-1) * friendsPair(n-2));
    }

    //Q. Print all binary Strings of size N without consecutive ones.
    public static void printBinaryStrings(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printBinaryStrings(n-1, 0, str+"0");

        if(lastPlace == 0){
            printBinaryStrings(n-1, 1, str+"1");
        }
    }

}