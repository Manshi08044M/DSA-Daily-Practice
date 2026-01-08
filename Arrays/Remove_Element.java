/*
 Day: 2
 Problem Name: Remove Element
 Topic: Arrays
 Platform: LeetCode
 Approach: Two Pointers (In-place)
 Time Complexity: O(n)
 Space Complexity: O(1)
*/
class Solution {

    public int removeElement(int[] nums, int val) {

        int k = 0; // index for valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
