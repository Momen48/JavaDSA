import java.util.*;

public class BubbleSort {
    public static void sort(int arr[]) {
        var x = arr.length - 1;
        for (int turn = 0; turn < x; turn++) {
            for (int j = 0; j < x - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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
        sort(arr);
        printF(arr);
    }
}
