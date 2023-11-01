 import java.util.*;
public class BinarySearch {
    public static int BSearch(int num[], int key){
        int start=num[0];
        int end = num.length-1;
        

        while(start<=end){
            int mid = (start+end)/2;
            // if found
            if(num[mid]==key){
                return mid;
            }
            // if mid 8< key 10 , then go right mid+1= new start 
            else if(num[mid]<key){
                start = mid+1;
            }
            // else mid 8> key 10, then go left as end = mid-1  
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int num[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        System.out.println("index:" + BSearch(num, key) );
    }
}
