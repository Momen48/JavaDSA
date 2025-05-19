import java.util.*;

// Pick The Smallest Of any array, and put it at the beginning
public class SelectionSort {

    public static void Selsort(int arr[]) {
        for (int i = 0; i < arr.length - 2; i++) {
            int min = i;
            // 5 enters as arr[0] = 5
            for (int j = i + 1; j < arr.length; j++) {
                // arr[j] = 4, then 1, then 3, then 2
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            // swap outside second loop
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printF(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 3, 2 };
        // System.out.println(arr.length);
        Selsort(arr);
        printF(arr);
    }
}
