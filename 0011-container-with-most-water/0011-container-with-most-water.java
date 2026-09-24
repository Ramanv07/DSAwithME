import java.util.Scanner;

public class Solution {

    public static int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while (left < right) {
            int area = (right - left) * Math.min(heights[left], heights[right]);
            max = Math.max(max, area);

            if (heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of heights: ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        // Input array elements
        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        // Output
        System.out.println("Maximum Area = " + maxArea(heights));

        sc.close();
    }
}