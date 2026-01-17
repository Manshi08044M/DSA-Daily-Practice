/*
 Day: 11
 Problem Name: Second Largest Element in Array
 Topic: Arrays
 Approach: Single Pass Comparison
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Second_Largest_Element {

    // Returns the second largest distinct element in the array
    // If it does not exist, returns -1
    public static int secondLargestElement(int[] nums) {

        // If array has less than two elements
        if (nums.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array once
        for (int num : nums) {

            // Update largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            // Update second largest only if num is distinct
            else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        // If second largest was never updated
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }
}
