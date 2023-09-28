import java.util.*;
public class LargestNumber {
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; //MIN_VALUE returns -infinity, MAX_VALUE returns +infinity
        for (int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest= num[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num [] = {1,6,8,12,3,9};

        System.out.println("Largest Number: "+ getLargest(num));
    }
}
