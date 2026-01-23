/*
 Day: 17
 Problem Name: Convert Sorted Array to Binary Search Tree
 Topic: Trees
 Platform: LeetCode
 Approach: Divide and Conquer (Recursion)
 Time Complexity: O(n)
 Space Complexity: O(log n)
*/

public class Sorted_Array_to_BST {

    // Converts a sorted array into a height-balanced BST
    public static TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    // Helper function to build BST using recursion
    private static TreeNode build(int[] nums, int left, int right) {

        // Base case: no elements to process
        if (left > right) {
            return null;
        }

        // Choose middle element to maintain balance
        int mid = left + (right - left) / 2;

        // Create root node
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build left and right subtrees
        root.left = build(nums, left, mid - 1);
        root.right = build(nums, mid + 1, right);

        return root;
    }
}
