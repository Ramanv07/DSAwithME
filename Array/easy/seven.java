package Array.easy;

import java.util.Arrays;

class Solution {
    // Reverse part of the array between given indices
    void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Rotate array left or right by k steps
    public int[] rotateArray(int[] nums, int k, String direction) {
        int n = nums.length;
        if (n == 0 || k == 0) return nums;

        k = k % n; // normalize k

        if (direction.equalsIgnoreCase("right")) {
            reverseArray(nums, 0, n - 1);
            reverseArray(nums, 0, k - 1);
            reverseArray(nums, k, n - 1);
        } else if (direction.equalsIgnoreCase("left")) {
            reverseArray(nums, 0, k - 1);
            reverseArray(nums, k, n - 1);
            reverseArray(nums, 0, n - 1);
        }

        return nums;
    }
}

public class seven {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        String direction = "left"; // try "right" as well

        int[] result = sol.rotateArray(nums, k, direction);

        System.out.println("Array after " + direction + " rotation by " + k + " places: " 
                           + Arrays.toString(result));
    }
}
