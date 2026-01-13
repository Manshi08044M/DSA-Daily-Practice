/*
 Day: 7
 Problem Name: Longest Common Prefix
 Topic: Strings
 Approach: Prefix Reduction
 Time Complexity: O(n * m)
 Space Complexity: O(1)
*/

public class Longest_Common_Prefix {

    // Returns the longest common prefix among all strings
    public static String longestCommonPrefix(String[] strs) {

        // Edge case: if array is null or empty
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take the first string as initial prefix
        String prefix = strs[0];

        // Compare prefix with remaining strings
        for (int i = 1; i < strs.length; i++) {

            // Reduce prefix until current string starts with it
            while (!strs[i].startsWith(prefix)) {

                // Remove last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
