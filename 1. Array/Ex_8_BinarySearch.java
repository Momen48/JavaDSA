public class Ex_8_BinarySearch{

    public static int binarySearch(int num[], int key){
        int start = 0, end = num.length-1;
        while (start <= end) {
            int mid = (start + end ) / 2;
        // comapare  
            if (num[mid] == key){
               return mid;
            }
            else if (num[mid] <= key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
         int num [] = {2,4,6,8,10,12,14,16};
         int key = 10;

         int index = binarySearch(num, key);

         System.out.println("index: " + index);
    }
}