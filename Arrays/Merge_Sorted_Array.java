/*
 Day: 10
 Problem Name: Merge Sorted Array
 Topic: Arrays
 Approach: Three Pointers (From Back)
 Time Complexity: O(m + n)
 Space Complexity: O(1)
*/

public class Merge_Sorted_Array {

    // Merges nums2 into nums1 as one sorted array in-place
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer for last element of valid part in nums1
        int i = m - 1;

        // Pointer for last element of nums2
        int j = n - 1;

        // Pointer for last position in nums1
        int k = m + n - 1;

        // Merge elements from the back to avoid overwriting
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
