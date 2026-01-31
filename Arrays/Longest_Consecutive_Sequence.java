import java.util.HashSet;
import java.util.Set;

/*
 Day: 25
 Problem Name: Longest Consecutive Sequence
 Topic: Arrays
 Platform: LeetCode
 Approach: HashSet + Sequence Detection
 Time Complexity: O(n)
 Space Complexity: O(n)
*/

public class Longest_Consecutive_Sequence {

    // Returns the length of the longest consecutive elements sequence
    public static int longestConsecutive(int[] nums) {

        // Edge case: empty array
        if (nums.length == 0) {
            return 0;
        }

        // Step 1: Store all numbers in a HashSet for O(1) lookup
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Step 2: Iterate through the set
        for (int num : set) {

            // Start counting only if num is the beginning of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

                // Step 3: Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update longest sequence length
                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}
