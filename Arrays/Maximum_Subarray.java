/*
 Day: 16
 Problem Name: Maximum Subarray
 Topic: Arrays
 Platform: LeetCode
 Approach: Kadane's Algorithm
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Maximum_Subarray {

    // Returns the maximum sum of a contiguous subarray
    public static int maxSubArray(int[] nums) {

        // Initialize current and maximum sum with first element
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Traverse the array from second element
        for (int i = 1; i < nums.length; i++) {

            // Either extend the existing subarray or start new
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum subarray sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
