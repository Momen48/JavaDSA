import java.util.*;
public class FstOccuranceOfArray {

    public static int FirstOcc(int arr[], int key, int i){
        if (i==arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return FirstOcc(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {1,2,4,5,7,8,5,2};

        System.out.println(FirstOcc(arr,9, 0));
    }
}
 