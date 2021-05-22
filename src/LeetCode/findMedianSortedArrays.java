package LeetCode;

public class findMedianSortedArrays {
    public static double findMedianBruteForce(int[] nums1, int[] nums2) { // (O(N+M) runtime, O(N+M) space)
        int totalSize = nums1.length + nums2.length;
        int[] newSorted = new int[totalSize];
        int pos1 = 0;
        int pos2 = 0;
        int median = totalSize / 2;
        for (int i = 0; i <= median; i++) { // runs once for each element before the median (roughly (N + M) / 2)
            if (pos1 >= nums1.length) {
                newSorted[i] = nums2[pos2];
                pos2++;
            } else if (pos2 >= nums2.length) {
                newSorted[i] = nums1[pos1];
                pos1++;
            } else if (nums1[pos1] < nums2[pos2]) {
                newSorted[i] = nums1[pos1];
                pos1++;
            } else {
                newSorted[i] = nums2[pos2];
                pos2++;
            }
        }
        if (totalSize % 2 == 1) {
            return newSorted[median];
        } else {
            return (newSorted[median] + newSorted[median - 1]) / 2.0;
        }
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if ((nums1.length + nums2.length) % 2 == 0) {
            return (helper(nums1, nums2, (nums1.length + nums2.length) / 2, 0, 0) + helper(nums1, nums2, (nums1.length + nums2.length) / 2 + 1, 0, 0)) / 2;
        } else {
            return helper(nums1, nums2, (nums1.length + nums2.length) / 2 + 1, 0, 0);
        }
    }

    public static double helper(int[] arr1, int[] arr2, int k, int st1, int st2) {
        if (st1 >= arr1.length) {
            return arr2[st2 + k - 1];
        } else if (st2 >= arr2.length) {
            return arr1[st1 + k - 1];
        }
        if (k == 1) {
            return Math.min(arr1[st1], arr2[st2]);
        }
        int curr = k / 2;

        // Size of array 1 is less than k / 2
        if (curr - 1 >= arr1.length - st1)
        {

            // Last element of array 1 is not kth
            // We can directly return the (k - m)th
            // element in array 2
            if (arr1[arr1.length - 1] < arr2[st2 + curr - 1])
            {
                return arr2[st2 + (k - (arr1.length - st1) - 1)];
            }
            else
            {
                return helper(arr1, arr2, k - curr,
                        st1, st2 + curr);
            }
        }

        // Size of array 2 is less than k / 2
        if (curr - 1 >= arr2.length - st2)
        {
            if (arr2[arr2.length - 1] < arr1[st1 + curr - 1])
            {
                return arr1[st1 + (k - (arr2.length - st2) - 1)];
            }
            else
            {
                return helper(arr1, arr2, k - curr,
                        st1 + curr, st2);
            }
        }
        else
            // Normal comparison, move starting index
            // of one array k / 2 to the right
            if (arr1[curr + st1 - 1] < arr2[curr + st2 - 1])
            {
                return helper(arr1, arr2, k - curr,
                        st1 + curr, st2);
            }
            else
            {
                return helper(arr1, arr2, k - curr,
                        st1, st2 + curr);
            }
    }
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}
