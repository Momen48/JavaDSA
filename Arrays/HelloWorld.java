import java.util.*;
class HelloWorld {
    public static int BinarySearch(int num[], int key){
        int start = num[0];
        int end = num.length-1;
        
        while(start<=end){
            int mid=(start + end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]>key){
                end =mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int num[]= {2,4,6,8,10,12,14,16};
       int key=10;
       
       System.out.print("the index:"+BinarySearch(num,key));
}