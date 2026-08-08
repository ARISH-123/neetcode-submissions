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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=null;
        ListNode n=head;
        while(n!=null)
        {
             prev=curr;
             curr=n;
             n=n.next;
             curr.next=prev;
             
        }
        return curr;
    }
}
