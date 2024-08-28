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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null)
        {
            int k = gcd(curr.val,curr.next.val);
            ListNode n = new ListNode(k);
            n.next = curr.next;
            curr.next = n;
            curr = curr.next.next;
        }
        return head;
    }
    public static int gcd(int a,int b)
    {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
 
        // Base case
        if (a == b)
            return a;
 
        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }
}