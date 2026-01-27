/*
 Day: 21
 Problem Name: Add Two Numbers
 Topic: Linked List
 Platform: LeetCode
 Approach: Digit-wise Addition with Carry
 Time Complexity: O(max(m, n))
 Space Complexity: O(max(m, n))
*/

public class Add_Two_Numbers {

    // Adds two numbers represented by linked lists
    // Digits are stored in reverse order
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node to simplify result list handling
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        // Traverse both lists until all digits and carry are processed
        while (l1 != null || l2 != null || carry != 0) {

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            // Create new node with current digit
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // Move to next nodes if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }
}
