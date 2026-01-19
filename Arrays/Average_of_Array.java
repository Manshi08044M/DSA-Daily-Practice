/*
 Day: 13
 Problem Name: Average of Array
 Topic: Arrays
 Approach: Sum and Divide
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Average_of_Array {

    // Returns the average value of elements in the array
    public static double averageOfArray(int[] nums) {

        long sum = 0;           // long used to avoid integer overflow
        int n = nums.length;

        // Calculate sum of array elements
        for (int num : nums) {
            sum += num;
        }

        // Compute average after loop
        double average = (double) sum / n;

        return average;
    }
}
