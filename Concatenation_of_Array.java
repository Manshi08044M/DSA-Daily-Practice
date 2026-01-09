/*
 Day: 3
 Problem Name: Concatenation of Array
 Topic: Arrays
 Platform: LeetCode
 Approach: Direct Index Mapping
 Time Complexity: O(n)
 Space Complexity: O(n)
*/

public class Concatenation_of_Array {

    // Returns an array formed by concatenating nums with itself
    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        // Copy elements to original and offset positions
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
