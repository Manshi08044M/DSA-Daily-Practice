import java.util.HashSet;
import java.util.Set;

/*
 Day: 2
 Problem Name: Longest Substring Without Repeating Characters
 Topic: Strings
 Platform: LeetCode
 Approach: Sliding Window (Two Pointers + HashSet)
 Time Complexity: O(n)
 Space Complexity: O(n)
*/

public class Longest_Substring_Without_Repeating_Characters {

    // Returns the length of the longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>(); // stores unique characters in window
        int left = 0;                         // left pointer of sliding window
        int maxLength = 0;                   // maximum length found

        // Right pointer expands the window
        for (int right = 0; right < s.length(); right++) {

            // Shrink window until duplicate character is removed
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character to the window
            set.add(s.charAt(right));

            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
