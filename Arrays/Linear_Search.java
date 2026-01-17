/*
 Day: 11
 Problem Name: Linear Search
 Topic: Arrays
 Approach: Sequential Search
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Linear_Search {

    // Searches for target element in the array
    // Returns index if found, otherwise returns -1
    public static int linearSearch(int[] nums, int target) {

        // Traverse the array element by element
        for (int i = 0; i < nums.length; i++) {

            // If target is found, return its index
            if (nums[i] == target) {
                return i;
            }
        }

        // Target not found
        return -1;
    }
}
