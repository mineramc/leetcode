package LeetCode;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> sums = new HashSet<>();
        if (nums.length < 3) {
            return new ArrayList<>(sums);
        }
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            numsMap.put(nums[j], j);
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int target = -num - nums[j];
                if (numsMap.containsKey(target) && numsMap.get(target) > j) {
                    Integer[] solution = new Integer[]{num, nums[j], target};
                    Arrays.sort(solution);
                    sums.add(Arrays.asList(solution));
                }
            }
        }
        return new ArrayList<>(sums);
    }
    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(t.threeSum(nums));
    }
}
