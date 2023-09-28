import java.util.*;
public class LinearSearch {

    public static int LSearch(int num[], int key){
       for(int i = 0; i<=num.length;i++){
        if(num[i]== key){
            return i;
        }
       } 
       return -1;
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5,8,10,12,13,15};
        int key = 10;
        int index = LSearch(num, key);
        if(index==-1){
            System.out.println("Not found!");
        }
        else{
            System.out.println("the position of the key:"+index);
        }
    }
}
