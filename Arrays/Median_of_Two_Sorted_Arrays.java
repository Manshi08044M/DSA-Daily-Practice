/*
 Day: 18
 Problem Name: Median of Two Sorted Arrays
 Topic: Arrays / Binary Search
 Platform: LeetCode
 Approach: Binary Search on Partitions
 Time Complexity: O(log(min(m, n)))
 Space Complexity: O(1)
*/

public class Median_of_Two_Sorted_Arrays {

    // Returns the median of two sorted arrays
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // Ensure nums1 is the smaller array for binary search
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0, high = m;

        // Binary search on smaller array
        while (low <= high) {

            int partitionX = (low + high) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            // Handle edge cases using MIN and MAX values
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            // Check if correct partition is found
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {

                // If total length is even
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY)
                            + Math.min(minRightX, minRightY)) / 2.0;
                }
                // If total length is odd
                else {
                    return Math.max(maxLeftX, maxLeftY);
                }
            }
            // Move towards left in nums1
            else if (maxLeftX > minRightY) {
                high = partitionX - 1;
            }
            // Move towards right in nums1
            else {
                low = partitionX + 1;
            }
        }

        // Input arrays are assumed to be sorted as per problem statement
        throw new IllegalArgumentException("Input arrays are not sorted");
    }
}
