/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow=head,fast=head.next;
        while(fast!=slow){
            if(fast.next==null||fast.next.next==null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}