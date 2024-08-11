import java.util.*;
public class LastOccuranceOfArray {

    public static int LastOcc(int arr[], int key, int i){

        if(i== arr.length){
            return -1;
        }
        int isFound = LastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
       
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,5,7,8,5,2};

        System.out.println(LastOcc(arr,5, 0));
    }
}
 