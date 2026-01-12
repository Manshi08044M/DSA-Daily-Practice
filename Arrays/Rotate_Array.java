/*
 Day: 6
 Problem Name: Rotate Array
 Topic: Arrays
 Approach: Reversal Technique
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Rotate_Array {

    // Rotates the array to the right by k steps
    public static void rotateArray(int[] nums, int k) {

        int n = nums.length;

        // In case k is greater than array length
        k = k % n;

        // Step 1: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 2: Reverse remaining elements
        reverse(nums, k, n - 1);

        // Step 3: Reverse the entire array
        reverse(nums, 0, n - 1);
    }

    // Helper function to reverse elements between two indices
    private static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

