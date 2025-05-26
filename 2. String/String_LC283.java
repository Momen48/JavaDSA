public class String_LC283 {
    public static void moveZeroes(int[] nums) {
    for (int i=0;i<nums.length; i++){
        int temp = nums[i];
        if(nums[i+1] != 0){
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        
        while (nums[i+1] == 0 && nums[i+2] <nums.length && nums[i+2]>0){
            int temp2 = nums[i+1];
            nums[i+1] = nums[i+2];
            nums[i+2] = temp2;
        }

        System.out.println(nums[i]+ " ");

    }
   
}

class Main {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
}
