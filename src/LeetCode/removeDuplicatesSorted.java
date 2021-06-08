package LeetCode;

import java.util.Arrays;

public class removeDuplicatesSorted {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        int counter = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[i]) {
                counter++;
            } else {
                nums[i+1] = nums[j];
                i+=1;
            }
        }
        return nums.length - counter;
    }
    public static void main(String[] args) {
        removeDuplicatesSorted r = new removeDuplicatesSorted();
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(r.removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
