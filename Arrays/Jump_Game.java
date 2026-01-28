/*
 Day: 22
 Problem Name: Jump Game
 Topic: Arrays
 Platform: LeetCode
 Approach: Greedy
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Jump_Game {

    // Returns true if last index is reachable, otherwise false
    public static boolean canJump(int[] nums) {

        int maxIndex = 0; // farthest index that can be reached so far

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // If current index is beyond reachable range, jump is not possible
            if (i > maxIndex) {
                return false;
            }

            // Update the farthest reachable index
            maxIndex = Math.max(maxIndex, i + nums[i]);
        }

        return true;
    }
}
