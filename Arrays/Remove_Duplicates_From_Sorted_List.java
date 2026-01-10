/*
 Day: 4
 Problem Name: Remove Duplicates from Sorted Linked List
 Topic: Linked List
 Platform: LeetCode
 Approach: Single Pointer Traversal
 Time Complexity: O(n)
 Space Complexity: O(1)
*/

public class Remove_Duplicates_From_Sorted_List {

    // Removes duplicate nodes from a sorted linked list
    // so that each element appears only once
    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        // Traverse the linked list
        while (current != null && current.next != null) {

            // If current node and next node have same value,
            // skip the duplicate node
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } 
            // Otherwise move to the next node
            else {
                current = current.next;
            }
        }

        return head;
    }
}
