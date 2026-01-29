/*
 Day: 23
 Problem Name: Add Two Numbers
 Topic: Linked List
 Platform: LeetCode
 Approach: Digit-by-digit addition with carry
 Time Complexity: O(max(m, n))
 Space Complexity: O(max(m, n))
*/

public class Add_Two_Number {

    // Adds two numbers represented by linked lists
    // Digits are stored in reverse order
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy head to simplify result list creation
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        // Continue until both lists are processed and carry is handled
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            // Add value from first list if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // Add value from second list if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Update carry for next iteration
            carry = sum / 10;

            // Create a new node with the current digit
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        // Return the head of the resulting linked list
        return dummy.next;
    }
}
