package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            set.put(nums[i], i);
        }
        int pos1 = 0;
        Integer pos2 = null;
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            pos2 = set.get(remainder);
            if (pos2 != null && pos2 != i) {
                pos1 = i;
                break;
            }
        }
        return new int[]{pos1, pos2};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 3, 4, 2}, 6)));
    }
}
