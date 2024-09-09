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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        ListNode curr = head;
        int[][] ans = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = -1;
            }
        }

        int top = 0, bottom = m-1, left = 0, right= n-1;

        while(curr != null && top<=bottom && left <=right){

            for(int i=left; i<=right && curr!=null; i++){
                ans[top][i] = curr.val;
                curr = curr.next;
            }
            top++;

            for(int i=top; i<=bottom && curr!=null; i++){
                ans[i][right]= curr.val;
                curr = curr.next;
            }
            right--;

            for(int i=right; i>=left && curr != null; i--){
                ans[bottom][i] = curr.val;
                curr = curr.next;
            }
            bottom--;

            for(int i=bottom; i>=top && curr!=null; i--){
                ans[i][left] = curr.val;
                curr = curr.next;
            }
            left++;
        }
        return ans;
    }
}