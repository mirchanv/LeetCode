/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
    
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carry = 0; 

        while (temp1 != null || temp2 != null) {
            int sum = carry;
            
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }

            ListNode newNode;
            if (sum >= 10) {
                int remainder = sum % 10;
                carry = sum / 10;
                newNode = new ListNode(remainder);
            } else {
                newNode = new ListNode(sum);
                carry = 0;
            }

            curr.next = newNode;
            curr = curr.next;
        }

        if (carry != 0) {
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }

        return dummy.next;
    }
}