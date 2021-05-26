package LeetCode;

public class ContainerMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int containerHeight = Math.min(height[left], height[right]);
        int maxArea = containerHeight * (right - left);
        while (left != right) {
            if (height[left] <= height[right]) {
                left += 1;
            } else {
                right -= 1;
            }
            containerHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, containerHeight * (right - left));
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ContainerMostWater c = new ContainerMostWater();
        //System.out.println(c.maxArea(new int[]{1, 1}));
        //System.out.println(c.maxArea(new int[]{4, 3, 2, 1, 4}));
        System.out.println(c.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
