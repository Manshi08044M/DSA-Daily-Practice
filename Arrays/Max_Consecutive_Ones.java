/*
 Day: 12
 Problem Name: Max Consecutive Ones
 Topic: Arrays
 Platform: LeetCode
 Approach: Single Pass Counting
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Max_Consecutive_Ones {

    // Returns the maximum number of consecutive 1s in the array
    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;       // current consecutive ones count
        int maxCount = 0;    // maximum consecutive ones found so far

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If current element is 1, increase count
            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            // If element is 0, reset count
            else {
                count = 0;
            }
        }

        return maxCount;
    }
}
