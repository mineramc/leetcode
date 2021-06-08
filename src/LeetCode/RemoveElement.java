package LeetCode;

import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            } else {
                nums[j] = nums[i];
                j++;
            }
        }
        return nums.length - counter;
    }

    public static void main(String[] args) {
        RemoveElement r = new RemoveElement();
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(r.removeElement(arr, 1));
        System.out.println(Arrays.toString(arr));
    }
}
