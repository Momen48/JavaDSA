import java.util.*;

public class SelectionSort {

    public static void Selsort(int arr[]) {
    }

    public static void printF(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Selsort(arr);
        printF(arr);
    }
}
