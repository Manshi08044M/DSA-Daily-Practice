/*
 Day: 8
 Problem Name: Rotate Array by One (Left Rotation)
 Topic: Arrays
 Approach: Shift Elements
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Rotate_Array_By_One {

    // Rotates the array to the left by one position
    public static void rotateArrayByOne(int[] nums) {

        int n = nums.length;

        // Store the first element
        int temp = nums[0];

        // Shift all elements one position to the left
        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }

        // Place the first element at the end
        nums[n - 1] = temp;
    }
}
